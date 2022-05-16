# Question
Insert Interval

# Source
https://leetcode.com/problems/insert-interval/

# Solution
- Time complexity: O(N)
- Created ArrayList.
- Add all the intervals ending before newInterval starts.
- Merge all overlapping intervals to one considering newInterval.
- Add the union of invervals we got.
- Add all the rest of intervals.
- Convert the ArrayList to Array and return it.
