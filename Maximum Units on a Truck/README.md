# Question
Maximum Units on a Truck

# Source
https://leetcode.com/problems/maximum-units-on-a-truck/

# Solution
 - Sort the array boxTypes in decreasing order of a number of units.
 - Start picking up each box type from boxTypes array starting from the index 0 position.
 - Calculate the total number of units and reduce the truck's remaining capacity based on the number of boxes put in the truck.
 - if truckSize is equal to or bigger than numberOfBoxes, multiply numberOfBoxesi with numberOfUnitsPerBoxi, add it to the total number of units, reduce the truckSize, and keep looping.
 - if truckSize is less than numberOfBoxes, multiply numberOfBoxes with numberOfUnitsPerBox, add it to the total number of units, and return the total number of units.
 - if truckSize is equal to or bigger than the total number of boxes from boxTypes, returns the total number of units after for loop.
