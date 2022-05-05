# Question
Meeting Rooms

# Source
https://leetcode.com/problems/meeting-rooms/

# Solution
-Time Complexity: O(nlogn)  
-Sort the intervals by their starting points.  
-Create an array *newInterval* and set it to the first interval.  
-Add the *newInterval* to the result array list *result*.  
-Compare the end point of the first interval and start point of the next interval.  
-If they overlap, update the end point of the *newInterval* to be the max end of the overlapping intervals.  
-Once a non overlapping interval is found, we can add the previous "extended" interval and start over (set the *newInterval* to the current interval).