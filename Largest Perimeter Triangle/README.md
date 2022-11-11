# Question
Largest Perimeter Triangle

# Source
https://leetcode.com/problems/largest-perimeter-triangle/

# Solution
 - Time complexity: O(N)
 - To form a triangle: The sum of the length of the two sides of a triangle is greater than the length of the third side
 - Sort the array *nums* to figure out the largest perimeter of a triangle
 - From the last element of array *nums* (from the largest number), Check if the nums[i-2]+nums[i-1] > nums[i] (*i* is the last index in the array *num*)
   - If it is true: return the sum of the three numbers
   - If it is false: decrease i by 1 and iterate the loop