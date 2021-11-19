# Question
Valid Palindrome II

# Source
https://leetcode.com/problems/valid-palindrome-ii/

# Solution
 - case1: deleting at most one character in the middle of the string s.
 - case2: deleting at most one character at the end of the string s.
 - case3: deleting at most one character at the beginning of the string s.
 - s.charAt(i) != s.charAt(j) in the for loop: checking case1.
 - while (i1 < j1 && s.charAt(i1) == s.charAt(j1)): checking case2.
 - while (i2 < j2 && s.charAt(i2) == s.charAt(j2)): checking case3.