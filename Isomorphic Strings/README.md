# Question
Isomorphic Strings

# Source
https://leetcode.com/problems/isomorphic-strings/

# Solution
 - Time complexity: O(N)
 - Initialize two arrays *m1* and *m2* with size 256 since the ASCII size is 256.
 - Instead of directly mapping a character to a character, make two characters have same value. 
 - Return false if mapping values in *m1* and *m2* are different.