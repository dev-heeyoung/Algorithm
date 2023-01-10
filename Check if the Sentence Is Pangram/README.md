# Question
Check if the Sentence Is Pangram

# Source
https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

# Solution
 - Time complexity: O(N)
 - Create HashSet *set* to store lowercase English letters from the sentence.
 - Iterate all the characters in the sentence and add it to the *set*.
 - Return true if the size of *set* is 26 since the alphabet consists of 26 letters.
 - Otherwise, return false.