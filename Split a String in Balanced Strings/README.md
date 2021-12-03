# Question
Split a String in Balanced Strings

# Source
https://leetcode.com/problems/split-a-string-in-balanced-strings/

# Solution
 - Create int res which will count the amount of split balanced strings and count which will count the consecutive numbers of the same letter.
 - Check each character of the given String s.
 - Decrease count by 1 if the letter is L.
 - Increase count by 1 if the letter is R.
 - If the numbers of L and the number of R are the same, the count will be 0.
 - If the count is 0, increase res by 1.
 - Return res after the loop.