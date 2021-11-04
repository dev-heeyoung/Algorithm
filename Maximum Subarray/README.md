# Question
Maximum Subarray

# Source
https://leetcode.com/problems/maximum-subarray/

# Solution
 When we see a question that ask for the maximum or minimum of something, we have to consider Dynamic programming as a possibility. We should figure out when a negative number is worth keeping in a subarray. We can uee Kadane's algorithm to solve this problem. First, I initialize 2 integer variables 'currentSubarray' and 'maxSubarray', and I set them to the first value in the array. currentSubarray will keep the running count of the current subarray we are focusing on and the maxSubarray will be the largest sum, which is return value. Iterate through the array, starting with the 2nd element (as we used the first element to initialize our variables).  For each number, add it to the currentSubarray. Any subarray whose sum is positive is worth keeping. However, when it becomes negative, we have to think about building new subarray. To decide which is worthy between keeping old subarray and building new subarray, set currentArray to the current element(nums[i]) and compare with maxSubarray. After foor loop, returns maxSubarray. 

# Kadane's algorithm
https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm
