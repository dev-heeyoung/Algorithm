# Question
Remove All Adjacent Duplicates In String

# Source
https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

# Solution
 ## Solution 1) Two Pointers
 - Time complexity: O(N)
 - i refers to the index to set next character in the output string.
 - j refers to the index of current iteration in the input string.
 - Iterate characters of S one by one by increasing j.
 - If S[j] is same as the current last character S[i - 1], we remove duplicates by doing i -= 2.
 - If S[j] is different as the current last character S[i - 1], we set S[i] = S[j] and iincrement i++.

 ## Solution 2) Stack
 - Time complexity: O(N)
 - Keep StringBuilder *res* as a characters stack.
 - Iterate characters of S one by one.
 - If the next character is same as the last character in res, remove the last character from res. (remove a pair of adjacent duplicates characters)
 - If the next character is different, we append it to the end of res.