# Question
Single Number

# Source
https://leetcode.com/problems/single-number/

# Solution
 ## Solution 1) HashSet
  - Time Complexity: O(n)
  - Iterate through all elements in *nums*.
    - Add an element into the HashSet if there isn't.
    - Remove the element from the HashSet if there is.
    - Only one single number will remain in the HashSet at the end. 
  - Iterate through all elements in *nums*.
    - Return the element HashSet has. 

 ## Solution 2) Bit Manipulation (XOR)
  - Time Complexity: O(n)
  - Initialize int *result* to 0.
  - XOR all bits together to find the single number.

# XOR examples
 - a XOR a = 0
 - 0 XOR a = a
 - a XOR b XOR a = a XOR a XOR b = b
 - 0 XOR a XOR b XOR a = a XOR a XOR 0 XOR b = 0 XOR b = b 