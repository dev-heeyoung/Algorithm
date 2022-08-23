# Question
Middle of the Linked List

# Source
https://leetcode.com/problems/middle-of-the-linked-list/

# Solution
- Time Complexity: O(N)
- Used two pointers: slow & fast
- Each time, slow go 1 steps while fast go 2 steps.
- When fast arrives at the end, slow will arrive right in the middle.