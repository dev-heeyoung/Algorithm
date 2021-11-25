# Question
Missing Number

# Source
https://leetcode.com/problems/missing-number/

# Solution
 ## Solution 1: Sorting
  - Sort the given array 'nums'.
  - Find the first element that does not match with its index and return it.
  - Return the largest element+1 if all the elements in the array match with their index.

 ## Solution 2: Gauss' Formula
  - https://nrich.maths.org/2478#:~:text=Gauss%20added%20the%20rows%20pairwise,quantity%20in%20a%20clever%20way.
  - Compute the expected sum by Gauss' formula:  int expectedSum = nums.length * (nums.length + 1) /2;
  - The number that is missing is the result of Gauss' formula - the sum of nums, which is actualSum.
