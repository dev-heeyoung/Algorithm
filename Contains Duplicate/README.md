# Question
Contains Duplicate

# Source
https://leetcode.com/problems/contains-duplicate/

# Solution
## Solution1: Sorting
 - Sorting is commonly used for searching for consecutive duplicates.
 - At first, sort the array, then check if the value is the same as the next value using For loop.

## Solution2: HashSet
 - We can use HashSet to solve this problem. 
 - Using For loop, add each value in the array to the HashSet.
 - If there is already the same value in the HashSet, return true.