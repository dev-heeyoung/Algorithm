# Question
Degree of an Array

# Source
https://leetcode.com/problems/degree-of-an-array/

# Solution
 - Time complexity: O(N)
 - Initialize HashMap *count* to store the frequency each elements and *first* to store the index of each element's first occurrence.
 - Initialize *degree* to keep degree and *res* to store the smallest possible length of a contiguous subarray of nums, that has the same degree as nums.
 - Iterate each numbers.
   - Put the element as a key and the index as a value to the *first* hashMap if there is no value for the element(key).
   - In the *count* HashMap:
     - If there is no value for the element(key): Put the element as a key and 1 as a value.
     - If there is a value for the element(key): Increase the value by 1.
   - If the element has the maximum frequency, update the degree = the frequency of the element and res = i - first[nums[i]] + 1.
   - If the element is one of the numbers that has the maximum frequency, update the res = min(res, i - first[nums[i]] + 1).