# Question
3Sum

# Source
https://leetcode.com/problems/3sum/

# Solution
- Time Complexity: O(n^2)
- Approach: Using two pointers
- Sort the inpu array *nums*.
- Start the main loop.
- int *i* is a current value, *j* is the next value, and *j* is the last index value.
- To find 3 sums, nums[i] + nums[j] + nums[k] = 0. It means, nums[j] + nums[k] = 0 - nums[i]. Let's say 0 - nums[i] is our *newTarget*.
- If the current value is same as the one before, skip it.
- Start the second loop inside of the first loop.
- while j is less than k, keep looping the second loop.
 --case1: When the sum of two numbers (nums[j], nums[k]) is equal to *newTarget*: 
  ---1. Create array with nums[i], nums[j], and nums[k] and add it to the result ArrayList<List<Integer>> result. 
  ---2. If nums[k] and nums[k-1] are same, decrease k by 1. If nums[j] and nums[j+1] are same, increase j by 1. This step is not to contain duplicate triplets. 
  ---3. Decrease k and increase j by 1 respectively.
 --case2: When the sum of two numbers (nums[j], nums[k]) is greater than *newTarget*: Decrease k by 1. 
 --case3: When the sum of two numbers (nums[j], nums[k]) is less than *newTarget*: Increase j by 1.
- 