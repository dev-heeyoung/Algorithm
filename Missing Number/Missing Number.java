Solution 1)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i] != i)
                return i;
        }
        return i;
    }
}

Solution 2)
class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) /2;
        int actualSum = 0;
        
        for(int num: nums) 
            actualSum += num;
        
        return expectedSum - actualSum;  
    }
}

