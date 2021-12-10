# Question
Subtract the Product and Sum of Digits of an Integer

# Source
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

# Solution
 - Create int array *arr* with the given array length + 1 size.
 - Set the values of *arr* from the second element because the first element should be 0.
 - *arr[i]* is set to *arr[i-1]* + *gain[i-1]*. 
 - Declare max and initialize it to the first element of *arr*.
 - Loop thorugh *arr* and find maximum number in *arr*.
 - Return *max*.