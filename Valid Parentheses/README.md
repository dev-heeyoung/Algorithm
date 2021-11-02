# Question
Valid Parentheses

# Source
https://leetcode.com/problems/valid-parentheses/

# Solution
I used Stack for this solution. To check the input string s is valid (Open brackets must be closed by the same type of brackets and they must be closed in the correct order.), I used For loop to check if each character in string is an open bracket, '(', '{', or '['. If it is, push the close bracket which is the same type of the open bracket into the stack. If it is not, check if the stack is empty or not. It returns false immediately. If it is not, get rid of the top value of the stack and check if the value matches with the character. If it does not match, return false because it means we encountered an unmatching pair of parenthesis. After checking all the elements in the string, return if the stack is empty. If the stack has value in it, that means the unmatching bracket still remains.
