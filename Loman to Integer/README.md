# Question
Roman to Integer

# Source
https://leetcode.com/problems/roman-to-integer/

# Solution
I created int array nums and used a switch to store the values for each symbol. Using for loop, loop through each character in the string and store the numbers symbolized by each character in a new int array nums in the same order as the order of the symbols in the string. After that, I loop through new int array nums and check if the element is smaller than the next element. If the element is smaller than the next element, that element should be deducted from the total of the values in the array. If not, that element should be added to the total. Lastly, add the last element of the array to the total. The last element is always added to the total.