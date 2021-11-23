# Question
Find Pivot Index

# Source
https://leetcode.com/problems/find-pivot-index/

# Solution
 - Compute the sum of values of the given array, nums.
 - If pivot value exists, the leftsum is same as the rightsum. It means [the sum of values of the given array] - [the pivot value] = 2 * leftsum.
 - Return the pivot index if it is found and -1 if there is not. 