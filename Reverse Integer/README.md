# Question
Reverse Integer

# Source
https://leetcode.com/problems/reverse-integer/

# Solution
- int *tail* is to find the last digit of an integer.
- int *checkRes* is to check if its digits reversed overflows. If overflow exists, the updated reversed digits will not equal to previous reversed digits. Return 0 in this case.
- store the *checkRes* value to the *res* if there is no overflow.
- divide the *x* by 10 to find the digit before the last digit of an integer.
- keep looping until there is no digit to be reversed.