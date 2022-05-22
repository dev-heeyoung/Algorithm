# Question
Decode String

# Source
https://leetcode.com/problems/decode-string/

# Solution
- Time complexity: O(maxK N)
- Solution with 2 stacks.
- We used one stack to store digits and the other one to store letters.
- Iterate all the characters from the input string.
- Case1) The character is digit: Set it to the int *k*. *considered the case where the number is greater than 9.
- Case2) The character is '[': Push *k* and *cur* into the *countStack* and *stringStack* respectively.
- Case3) The character is ']': 
  1. Pop the number to repeat a letter from *countStack*.
  2. Store the current string *cur* to the *tmp*.
  3. Pop a string from *stringStack* and store it to the *cur*.
  4. Pop a number to repeat a letter from *countStack*.
  5. Append the *tmp* as many times as the number that is popped from *countStack*.
- Case4) The character is a letter: Append it to the *cur*.
- Convert the *cur* to String and return it after loop.