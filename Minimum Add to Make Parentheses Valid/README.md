# Question
Minimum Add to Make Parentheses Valid

# Source
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

# Solution
- Time Complexity: O(N)  
- To make a string valid, the number of '(' and ') should be the same.  
- *count* is to count the number of '(' or ')' we need to add.  
	- *count* is positive: We need more ')'.
	- *count* is 0: The string is valid.
	- *count* is negative: We need more '('.
- *stackSize* is to check if there is matching ')' for '(' before a specific character.
- case1) The character is '(': Increase *count* and *stackSize* by 1. It means we need ')'.
- case2) The character is ')' and the stackSize is less than 1: Increase *count* by 1. It means there is no '(' for the current ')'. 
- case3) The character is ')' and the stackSize is greater than or equal to 1: Decrease *count* and *stackSize* by 1. It means there is macthing '(' for the current ')'.
- Return the absolute value of *count*.