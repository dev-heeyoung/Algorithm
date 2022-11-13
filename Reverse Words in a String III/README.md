# Question
Reverse Words in a String III

# Source
https://leetcode.com/problems/reverse-words-in-a-string-iii/

# Solution
 - Time complexity: O(N) ** N: The length of string *s*.
 - Convert the string *s* to char array *charArr*
 - Find the start and last index of the word by cheking the index of ' ' or the end of the string.
 - Reverse the characters in the current word using two pointer approach
 - Move on to the next word and repeat the same process
 - Return new String from the char array *charArr*