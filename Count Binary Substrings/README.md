# Question
Count Binary Substrings

# Source
https://leetcode.com/problems/count-binary-substrings/

# Solution
 - The number of valid substring will be the minimum number of consecutive 0 and 1. For example, "00111" will be min(2, 3) = 2, ("01", "0011").
 - To check the minimum number of consecutive 0 and 1, we need to count the number of 1 or 0 grouped consecutively. For example, "00110011" will be 4. ("00", "11", "00", "11")
 - Check if s.charAt(i) == s.charAt(i - 1): It is to count the number of 1 or 0 groped consecutively.
 - res += Math.min(cur, pre): It is to find the minimum number of 0 and 1 and add the value to the result.

 