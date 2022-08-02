# Question
Merge Sorted Array

# Source
https://leetcode.com/problems/merge-sorted-array/

# Solution
 - Time complexity: O(m+n)
 - Merge sorted array from the end so that we don't need to use additional space.
 - Use 3points
   - i: to point value in the *num1*
   - j: to point value in the *num2*
   - idx: to point the index where the bigger value between nums1[i] and nums2[j] will be at  