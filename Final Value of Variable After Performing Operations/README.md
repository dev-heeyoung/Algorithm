# Question
Final Value of Variable After Performing Operations

# Source
https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

# Solution
 - Create int *res* to count the final value.
 - We can figure out whether to increase or decrease the *res* by checking the second letter of the string. Check the character with index 1 of each string.
 - Increase *res* by 1 if the character is *+*.
 - Decrease *res* by 1 if the character is *-*.
 - Return *res* after for loop.
