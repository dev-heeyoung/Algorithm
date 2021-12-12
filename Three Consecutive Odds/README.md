# Question
Three Consecutive Odds

# Source
https://leetcode.com/problems/three-consecutive-odds/

# Solution
 - Create int *count* and initialize it to 0. It counts consecutive odd numbers.
 - Check each number in the given array *arr*. Increase *count* if the number is odd, or set *count* to 0 if the number is even.
 - Return true if the *count* is 3.