# Question
Longest Common Prefix

# Source
https://leetcode.com/problems/longest-common-prefix/

# Solution
I used sort in this solution. First, I sorted the array, and I simply compare the first and last elements in the sorted array. The loop checks how many same characters the first and last elements have (=i). Then, return substring from index 0 to the index i.   
