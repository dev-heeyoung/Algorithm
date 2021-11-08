# Question
Two Sum

# Source
https://leetcode.com/problems/two-sum/

# Solution
I could have used 2 for loops but it has high time complexity. So, I solved the question with HashMap. First, I created int array which is going to be the result and HashMap to store values and keys. Using for loop, I put the value of the index as a key and the index of array as a value. For example, if the nums array is [5,2,3], the map will be [key:5, value:0]... If current element's complement already exists in the hash table, the result(indices) will be returned immediately.