# Question
Climbing Stairs

# Source
https://leetcode.com/problems/climbing-stairs/

# Solution

 ## The key intuition:
 - The key point to solve the problem is using Fibonacci (F[n] = F[n-1] + F[n-2]).

 ## 3 Base cases:
 - if n<=0, the number of distinct ways to the top is 0.
 - if n==1, the number of distinct ways to the top is 1.
 - if n==2, the number of distinct ways to the top is 2.

 ## Implementation:
 - By applying Fibonacci to this solution, we can simply find the number of distinct ways to the top because we already know the number of distinct ways to the top when the number n is 1 and 2.
 - "total" refers to the number of distinct ways to the top [n], "oneBefore" refers to the number of ways to the top until the point [n-1], and "twoBefore" refers to the number of ways to the top until the point [n-2].
 - Using For loop, start i with 3, whenever i is increased by 1, the "total" value becomes the number of solutions until the point [n-1] + the number of solutions until the point [n-2], the "twoBefore" becomes the number of solutions until the point [n-1], and the "oneBefore" becomes the number of solutions until the point[n], which is total.

# Fibonacci Sequence
F[n] = F[n-1] + F[n-2]
https://en.wikipedia.org/wiki/Fibonacci_number
