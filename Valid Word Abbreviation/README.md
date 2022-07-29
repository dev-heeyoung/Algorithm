# Question
Valid Word Abbreviation

# Source
https://leetcode.com/problems/valid-word-abbreviation/

# Solution
- Initialized *i* and *j* to 0.
- Started loop while *i* is less than the length of the *word* and *j* is less than the length of the *abbr*.
- If the value of index *i* from *word* and the value of index *j* from *abbr* are the same
  - Increase *i* and *j* by 1.
- If a number has a leading zero
  - Return false.
- If a number doesn't start with zero
  - Store the start point index of the number and Increase *i* while there is an adjacent number.
- Get the adjacent numbers and add it to the *i*.
- Return true if the *i* is equal to the length of the *word* and the *j* is equal to the length of the *abbr* after the loop.
  - If they are not, there is no matching char(s).