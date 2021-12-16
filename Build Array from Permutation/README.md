# Question
Build Array from Permutation

# Source
https://leetcode.com/problems/build-array-from-permutation/

# Solution
 - Create int array *res*. It will be the return value.
 - Iterate through the given int array *nums*. Set *res[i]* to nums[nums[i]].
 - Return *res*.