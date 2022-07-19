# Question
Unique Number of Occurrences

# Source
https://leetcode.com/problems/unique-number-of-occurrences/

# Solution
- Time Complexity: O(n) *n: the size of array
- Create a HashMap (key: value, value: the number of occurrences of each value)
- Iterate the array and put a key and value into the map.
  - If the key exists: increase the value for the key by 1.
  - If the key doesn't exist: Store the element as a key and 1 as a value.
- Create a Set using values from the map.
- Compare the size of the map and set.
  - If the size is equal: return true.(It means, the number of occurrences of each value in the array is unique.)
  - If the size is not equal: return false.