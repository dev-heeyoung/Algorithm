# Question
Shuffle the Array

# Source
https://leetcode.com/problems/shuffle-the-array/description/

# Solution
 - Time complexity: O(N)
 - Build an array *res* of size 2 * n.
 - Iterate over the nums array ranging from indices 0 to n - 1:
 - Store the element xi+1, that is, nums[i] at index 2*i, and element yi+1, that is, nums[n+i] at index 2*i+1 in result.
 - Return the result array.
 