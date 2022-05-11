# Question
Subarray Sum Equals K

# Source
https://leetcode.com/problems/subarray-sum-equals-k/

# Solution
- Time Complexity: O(N)
- Use map to store SUM[0, i-1] as a key and the number of times the same sum occurs as a value.
- map.put(0, 1): It is for (sum-k) == 0 calculations. It is needed for non-positive values.
- preSum.containsKey(sum - k): SUM[i, j] is the key in this solution.    
	SUM[i, j] = SUM[0, j] - SUM[0 , i-1]   
	k = *sum* - SUM[0 , i-1]
	SUM[0 , i-1] = k - *sum*  
	If SUM[0 , i-1] is in the map as a key, get the value and add it to the *count*.
- preSum.put(sum, preSum.getOrDefault(sum, 0) + 1): Every time we encounter a new sum, we make a new key and value in the hashmap corresponding to that sum. If the same sum occurs again, we update the count corresponding to that sum in the hashmap.