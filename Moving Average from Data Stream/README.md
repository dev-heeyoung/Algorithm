# Question
Moving Average from Data Stream

# Source
https://leetcode.com/problems/moving-average-from-data-stream/

# Solution
- Time Complexity: O(1)
- *window*: Array of the moving window
- *n*: The number of values in the moving window
- *index*: The index where the next value will be
- *size*: The size of the moving window
- Used Circular queue
- keep the sum so far and update the sum just by replacing the oldest number with the new value.