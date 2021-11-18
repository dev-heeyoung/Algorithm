# Question
Palindrome Number

# Source
https://leetcode.com/problems/palindrome-number/

# Solution
 - x (input) cannot be a palindrome number if it is less than 0. Return false.
 - Copy the input value x to y. We need the original input value to compare it with the reverted value at the end.
 - Reverting: change the order of the number one by one.
 - Return true if the reverted value is the same as the original input value x.