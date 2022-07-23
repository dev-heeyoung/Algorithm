# Question
Count Odd Numbers in an Interval Range

# Source
https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

# Solution
- Time Complexity: O(1)
- nums = Total numbers in the range
- Count of even number
 - Case1: Starting and ending with odd numbers - nums/2 + 1
 - Case2: Starting with odd and ending with even - nums/2
 - Case3: Starting with even and ending with odd - nums/2
 - Case4: Starting and ending with even numbers - nums/2