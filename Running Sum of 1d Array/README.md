# Question
Running Sum of 1d Array

# Source
https://leetcode.com/problems/running-sum-of-1d-array/

# Solution
 - We do not need to create an extra array to store the results. 
 - The first element of the result array will be the same as the first element of the input array.
 - Start the for loop with index 1.
 - Increase nums[i] by the previous index's running sum.