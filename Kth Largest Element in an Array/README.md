# Question
Kth Largest Element in an Array

# Source
https://leetcode.com/problems/kth-largest-element-in-an-array/

# Solution
 ## Solution 1) Sorting Array
 - Time complexity: O(NlogN)
 - Sort the entire array and then access the element by index.

 ## Solution 2) Heap(Priority Queue)
 - Time complexity: O(Nlogk)
 - Put each value to the Priority Queue *pq* and keep it with size k.

 ## Solution 3) QuickSelection Sort
 - Time complexity: O(N) *worst case: O(N^2)
 - The worst case is when we need to search all the elements (when the arrays is already sorted).
 - Whenever we call the parition function, the position of one element is fixed.