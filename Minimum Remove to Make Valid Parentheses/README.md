# Question
Minimum Remove to Make Valid Parentheses

# Source
https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

# Solution
- Time complexity: O(N)
- Use Stack to check the indexes that should be removed.
- If we see '(', add its index to the stack.
- If we see ')', remove the top value of the stack if the top value is '('. Otherwise, add its index to the stack.
- The indexes which are in the stack are the indexes that should be removed from the input string.
- Use Set to keep track of the unmatched '(' and ')'.
- Build a new string with removed indexes using the Set.
- Conver the StringBuilder to String and return it.
