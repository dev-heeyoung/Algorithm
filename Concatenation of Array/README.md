# Question
Concatenation of Array

# Source
https://leetcode.com/problems/concatenation-of-array/

# Solution
 - Create an array ans of length 2n.
 - Use for loop to set the values to new array ans.
 - Set ans[i] and ans[i+nums.length] in one loop to reduce the number of times you repeat the for statement.
 