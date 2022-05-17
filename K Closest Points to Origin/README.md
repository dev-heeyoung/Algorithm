# Question
K Closest Points to Origin

# Source
https://leetcode.com/problems/k-closest-points-to-origin/

# Solution
- Time complexity: O(NlogN)
- Store all the points into the Priority Queue in ascending order by distance.  
- Created int[] array *result* with the size k.
- Extract the k points from the priotity queue and store them into the newly created array, *result*.
- Return the array *result*.