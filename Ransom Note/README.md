# Question
Ransom Note

# Source
https://leetcode.com/problems/ransom-note/

# Solution
 - Time complexity: O(m) / ** m: The length of magazine.
 - Check for obvious fail case.
 - Create int array *freq* to store the number of each letter in the magazine.
 - Iterate each character in the ransom note. Get the current count for the character from the *freq* array.
    - The count is 0 : return false
    - The count is not 0 : Update the count for the character.
 - Return true after for loop.