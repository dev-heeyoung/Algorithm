# Question
Add Strings

# Source
https://leetcode.com/problems/add-strings/

# Solution
I used StringBuilder for the return value because it is efficient to insert characters into the StringBuilder object. I declared the last index values of num1 and num2 as p1 and p2 because we calculate the sum of the last digits when we calculate the sum of the numbers. Then, the while loop will run as long as there are characters left in one of the strings. Starting from right to left, each character is converted to an integer by using " num.charAt(p) - '0' ". This is to convert a char value to a decimal value. If there is no character, set the value to 0. The remainder of the sum of the two numbers divided by 10 is stored in the value, and the quotient is stored in the carry. The value stored in the carry is added to the sum of the index-1 values. After while loop, if statement check if there is carry we have to add, and if it is, append it to the String result. Since we added the number from right to the left, and append the values in the same order, we have to reverse the order of the characters.


