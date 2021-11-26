# Question
Valid Anagram

# Source
https://leetcode.com/problems/valid-anagram/

# Solution
 ## Solution 1: Sorting
  - If t is an anagram of s, they have to have not only the same length but also identical string when the strings are sorted.

 ## Solution 2: Hash Table
  - Return false if both strings do not have the same length.
  - Create an array to store the count for each alphabet.
  - Increase the counter for each letter and decrease the counter for each letter in t.
  - Check if all the counter is zero.