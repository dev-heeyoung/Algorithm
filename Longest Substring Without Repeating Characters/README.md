# Question
Longest Substring Without Repeating Characters

# Source
https://leetcode.com/problems/longest-substring-without-repeating-characters/

# Solution
## Solution1) HashSet
The idea is to use a HashSet to track the longest substring without repeating characters so far using two pointers i and j.
i indicates the first index of substring and j is moved forward. Check if the character at j position is in the HashSet. If it is, remove the character at i position from the HashSet and increase i. Repeat this process until the character at j position is deleted and i become the first index of the new substring. If it is not, add the character at j position into the HashSet. Compare max to the size of HashSet and store the bigger value into the max.

## Solution2) HashMap
The idea is to use a HashMap to track the longest substring without repeating characters so far using two pointers i and j. The HashMap stores the characters as keys and their position(index) as values. Two pointers are used to find the length of the longest substring. Move the i pointer to look through the string and add the character at i position to the HashMap. If the character at i position exists in the HashMap, move the pointer j to the right of the same character last found. It indicates the first index of the new substring.