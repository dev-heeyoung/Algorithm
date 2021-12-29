# Question
Plus One

# Source
https://leetcode.com/problems/plus-one/

# Solution
 - Iterate the given int array *digits* from the end to the start.
 - Increase the rightmost not-nine by 1 and return the array.
 - Set all the nines at the end of array to zeros.
 - We need to increase the array size by 1 if all the digits are nines.
 - Set the first element of array to 1.
 - Return the array *digits*.