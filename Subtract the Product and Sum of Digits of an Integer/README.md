# Question
Subtract the Product and Sum of Digits of an Integer

# Source
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

# Solution
 - How to get each digit fot a number.  
 - Create int *sum* to store the sum of digits and *product* to store product of digits.
 - While a number *n* is bigger than 0, divide the n value by 10 and find the remainder.
 - Add the remainder to the *sum* and multiply *product* by the digit.
 - Divide the n by 10 to extract the next digit for the number.
 - Return *product* - *sum*.