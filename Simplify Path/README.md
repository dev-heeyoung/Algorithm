# Question
Simplify Path

# Source
https://leetcode.com/problems/simplify-path/

# Solution
- Time complexity: O(N)
- Split the String path by '/' and store them into the String array *stringArr*.
- Add each String to the stack if it's not '', '.' or '..'.
- Remove the top of stack if the String is '..' because it refers to the directory up a level.
- Return '/' which is the first character of path if the stack is empty.
- Pop(get and remove the top) from the stack and store it with '/' before the string into the StringBuilder *res*. Repeat it until the stack becomes empty.
- Convert the *res* to String and return it.