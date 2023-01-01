# Question
Make The String Great

# Source
https://leetcode.com/problems/make-the-string-great/description/

# Solution 1) Recursion
 - Time complexity: O(N^2)
 - Iterate over the input string s and check if a pair exists.
 - If we find one pair, remove it from s, and start over this step with the remaining string. (call the function recursively)
 - Otherwise, return s.

# Solution 2) Stack
 - Time complexity: O(N)
 - Initialize an empty stack *stack*.
 - For each character *cur*, if *cur* pairs with the last character in stack, remove the character at the top of stack.
 - Otherwise, add *cur* to stack.
 - Once we have finished iterating, return the string concatenated by all the remaining characters in stack.