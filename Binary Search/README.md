# Question
Binary Search

# Source
https://leetcode.com/problems/binary-search/

# Solution
- while start <= end: start and end define the range for searching
- Set mid value to the middle index between start and end
- case1) target is bigger than the middle index value: start = mid+1, continue the search on the right
- case2) target is smaller than the middle index value: end = mid-1, continue the search on the left
- case3) target is found: return the index