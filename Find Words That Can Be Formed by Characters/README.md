# Question
Find Words That Can Be Formed by Characters

# Source
https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

# Solution
- Time Complexity: O(N*M) ** N: the number of strings, M: the maximum length of strings
- Create int array *countArr* and store the number of each character in the array *countArr*
- Create and initialize *res* to 0. It will count the sum of lengths of all good strings in words. 
- Loop through each word
  - Copy the array *countArr*
  - Set int *tmp* to 0. It counts 
  - Loop through each letter
    - if the number of that letter in the array is greather than 0: increase *res* and *tmp* by 1 respectively, and decrease the count for that letter in the copied array *copiedArr* by 1.  
    - if the number of that letter in the array is less than or equal to 0: subtract the *tmp* from *res*, and check the next word.
- Return the *res* after loop.