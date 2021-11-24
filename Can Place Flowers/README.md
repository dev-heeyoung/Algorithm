# Question
Can Place Flowers

# Source
https://leetcode.com/problems/can-place-flowers/

# Solution
 -case1: There are 0s in the middle of the given array.
 -case2: The given array starts with 0.
 -case3: The given array ends with 0. 

case1: We can place (count-1)/2 flowers.
case2: We can place count/2 flowers: Set the count value to 1 before loop.
case3: We can place count/2 flowers: if(count!=0) total += count/2 after loop.