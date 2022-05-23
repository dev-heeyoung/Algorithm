# Question
Generate Parentheses

# Source
https://leetcode.com/problems/generate-parentheses/

# Solution
- Solution with recursion.
- Created array list *list*. It will be the final output.
- Base case: 
  - Add the string to the *list*: If the length of String *str* is equal to n*2 (n matched '(' and ')').
- Recursive case:
  - Add '(': If the number of open parentheses is smaller than *n*.
  - Add ')': If the number of close parentheses is smaller than the number of open parentheses.