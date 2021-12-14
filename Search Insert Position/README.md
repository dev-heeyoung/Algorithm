# Question
Search Insert Position

# Source
https://leetcode.com/problems/search-insert-position/

# Solution 
 - Create int *i*. It will be a return value.
 - Iterate through the given int array *nums* until i is less than the length of *nums* and *nums[i]* is equal to or less than *target*. We do not need to think about the numbers that are greater than the *target*.
 - Return the index if the target is found.
 - The return value will be the next index of the index that has closest smaller number to the target if the target is not found.