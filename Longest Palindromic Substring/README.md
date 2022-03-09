# Question
Longest Palindromic Substring

# Source
https://leetcode.com/problems/longest-palindromic-substring/

# Solution
1. int start is to find the first index of the longest palindromic substring in s.
2. int maxLen is to find the length of it. Set it to 1 at the beginning in case the size of s is 1.
3. Call the function *extendPalindrome* 2 times. The first call is for odd length and the second call is for even length.
 3-1. Expending the range(decrease left position and increase right position) until the characters at the left position and right position are not equal.
 3-2. If the maxLen is bigger than the length of the range, set Start to the next position of right and set maxLen to the length of the new range (from left to right).
4. Repeat 3 until the loop goes through all the characters.
5. Return the substring from a start index to end index(start+maxLen).