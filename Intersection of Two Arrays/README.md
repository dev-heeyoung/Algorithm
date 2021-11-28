# Question
Intersection of Two Arrays

# Source
https://leetcode.com/problems/intersection-of-two-arrays/

# Solution
 - Add all unique numbers in the given array nums1 to the integer HashSet 'set'.
 - Add the numbers included in the nums2 array and the HashSet set to the integer HashSet 'intersect'.
 - Create an int array 'res' with the HashSet intersect size. This will be the result array.
 - Put all the values in the HashSet intersect into the newly created array res.
 - Return res.