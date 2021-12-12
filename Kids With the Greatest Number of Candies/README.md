# Question
Kids With the Greatest Number of Candies

# Source
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

# Solution
 - Create Boolean ArrayList *list*.
 - Find the maximum number, *max*, in the given array *candies*.
 - If a kid has candies more than [the greatest number of candies] - [extra candies], it means the kid will have the greatest number of candies.
 - Calculate [the greatest number of candies] - [extra candies], and store the value into the *max*.
 - Iterate through the given array *candies*.
 - Check if the number of candies is equal to or greater than *max*. If it is, add 'true' to the *list*. Otherwise, add 'false' to the *list*.
 - Return *list*.