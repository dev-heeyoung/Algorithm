# Question
Majority Element

# Source
https://leetcode.com/problems/majority-element/

# Solution
I can find the majority element in the array using an iterative loop. I initialized the 'majority' to the value of the first index, 'count' to 1. In for loop, I checked if the value of the next index(nums[i]) is same as the previous value(nums[i-1]). If it is, increase the count value by 1. If it is not, decrease the count value by 1. If the count value becomes 0 (means that the majority didn't appear equal to or more than [the length of the array up to the current value/2].), change the 'majority' value to the current value (num[i]), and increase the count value by 1. Returns the majority value after for loop.

## Example:
nums array 3,2,3<br />
count      1 0 1<br />
majority   3 2 3<br />

nums array 2,2,1,1,1,2,2<br />
count	   1 2 1 0 1 0 1<br />
majority   2 2 2 2 1 2 2<br />
