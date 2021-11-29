# Question
Rank Transform of an Array

# Source
https://leetcode.com/problems/rank-transform-of-an-array/

# Solution
 - Copy the given array 'arr' into 'res' and sort it.
 - Create HashMap 'map' and record the rank for each element in the hashmap 'map' by iterating sorted array 'res' (Keys: elements in the array, values: ranks).
 - Iterate the given array 'arr' and assign the recorded rank for each element to the 'res'.