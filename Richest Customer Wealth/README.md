# Question
Richest Customer Wealth

# Source
https://leetcode.com/problems/richest-customer-wealth/

# Solution
 - Create int *res* which will be the return value, the maximum wealth.
 - Use Nested Loops to count each wealth(amount of money) in each row.
 - Calculate the sum of numbers in a row.
 - Move to the next row, calculate the sum of numbers in a row, compare the sum with the previous sum, and store the maximum value into the *res*.
 - Loop loops until the sums of numbers for all rows are calculated.
 - Return *res* after loops.