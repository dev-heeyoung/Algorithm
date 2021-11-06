# Question
Sign of the Product of an Array

# Source
https://leetcode.com/problems/sign-of-the-product-of-an-array/

# Solution
 There are 3 return cases in this question. I set the return value sign to 1 at the beginning and change the value only if the product of an array is negative or equal to 0. If any element in the array is 0, the product of an array will be 0. Also, we only need if the product of an array is positive, negative, or equal to 0 so we don't need to multiply all the elements of the array. Instead, we can change the sign whenever the product of an array encounters a negative value (example: 1 x -1 = -1,  -1 X -1 = 1). 