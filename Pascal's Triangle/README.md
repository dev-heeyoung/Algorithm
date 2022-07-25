# Question
Pascal's Triangle

# Source
https://leetcode.com/problems/pascals-triangle/

# Solution
- Time Complexity: O(numRows^2)
- Create an ArrayList *result* with lists.
- Start for loop (by row)
  - Created an ArrayList *list* with integers.
  - Start a loop inside of the loop (by column)
    - Add 1 if the location of a value is the first or last element in a row.
    - Add two elements from previous row elements if the location of the value is not the first or last element in a row.
  - Add the list (each row) to the *result*.
- Return *result*.
