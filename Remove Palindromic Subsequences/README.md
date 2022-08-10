# Question
Remove Palindromic Subsequences

# Source
https://leetcode.com/problems/remove-palindromic-subsequences/

# Solution
- Key point
    1. There are only 2 unique letters that can appear in the string.
    2. The subsequence does not need to be consecutive.
    3. Therefore, we can remove all the a as a single palindromic subsequence, and then, all the b as a single palindromic subsequence.
- Time complexity: O(N)
- There are 3 answers.
  - 0: If the string is empty
  - 1: If the entire string is a palindrome
  - 2: The rest cases
- Checking if s is a palindrome: Using 2 pointers.
 