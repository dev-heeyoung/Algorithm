# Question
Add Binary

# Source
https://leetcode.com/problems/add-binary/

# Solution
 - Used StringBuilder for the return value because it is efficient to insert characters into the StringBuilder object.
 - Initialized posA and posB to the last index of each string to use for the sum of the last digits.
 - Starting from right to left, each character is converted to an integer by using " string.charAt(pos) - '0' ". This is to convert a char value to a decimal value.
 - The remainder of the sum of the two numbers divided by 2 (for the sum as a binary string) is stored in the value, and the quotient is stored in the carry.
 - The value stored in the carry is added to the sum of the index-1 values. 
 - After while loop, which means there is no value in either string a or b left, check if there is carry that has to be added, and if it is, append it to the String result.
 - Since we added the number from right to the left, and append the values in the same order, we have to reverse the order of the characters.