# Question
Merge Intervals

# Source
https://leetcode.com/problems/merge-intervals/

# Solution
-Time Complexity: O(nlogn)
-Sort the intervals by their starting points.
-Compare the end point of the first interval and start point of the next interval.
-Return false if they overlap.
-Return true if there is no overlap.
