# Question
Minimum Number of Swaps to Make the String Balanced

# Source
https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/

# Solution
- Time complexcity: O(n)
- int *count* is to calculate for the minimum number of swaps to make s balanced.
- Increase *count* by 1 if the character is '['.
- Decrease *count* by 1 if the character is ']' and the count is bigger than 0.
- Return (count+1)/2:  
  There is a pattern to get the minimum number of swaps.
  mismatches: 0, 1, 2, 3, 4, 5...
  swaps:      0, 1, 1, 2, 2, 3...