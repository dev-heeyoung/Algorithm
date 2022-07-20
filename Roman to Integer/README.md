# Question
Roman to Integer

# Source
https://leetcode.com/problems/roman-to-integer/

# Solution
- Time complexity: O(n)
- Created a new int array *arr* to store value for the symbols.
- Iterated each character in the string and stored the value into a newly created array.
- Created int *sum* which will be the return value.
- Iterated each value in the *arr*.
- When we add and subtract numbers, the order doesn't affect the result.
- If arr[i] < arr[i+1] : subtract the arr[i] from the *sum*.
- If arr[i] >= arr[i+1] : add the arr[i] to the *sum*.
- Added the last value in the *arr* to the sum and return the *sum*. (The last element is always bigger than the previous value)