# Question
Fibonacci Number

# Source
https://leetcode.com/problems/fibonacci-number/

# Solution
 ## Solution 1: Iterative
 - Return 0 if the input value is 0, and return 1 if the it is 1 or 2.
 - Initializ 3 variables to store each state fib(N)=total , fib(N-1)=oneBefore, and fib(N-2)=twoBefore. 
 - Since we already know the return values when n is 0, 1, or 2, start the loop with 3.
 - Set the total value to oneBefore + twoBefore.
 - Set the twoBefore to oneBefore.
 - Set the OneBefore to total.
 - When we reach N+1, exit the loop and return the previously set total value.

 ## Solution 2: Recursion
 - Return n if the input value is less than or equal to 1.
 - Otherwise, the function fib(int n) calls itself, with the result of the 2 previous numbers being added to each other, passed in as the argument. This is derived directly from the recurrence relation: F{n} = F{n-1} + F{n-2}.
 - Do this until all numbers have been computed, then return the resulting answer.