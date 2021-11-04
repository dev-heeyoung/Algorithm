class Solution {
    public int maxSubArray(int[] nums) {
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        
        for(int i=1; i<nums.length; i++){
            currentSubarray = Math.max(nums[i], currentSubarray + nums[i]);
            maxSubarray = Math.max(currentSubarray, maxSubarray);
        }
        
        return maxSubarray;
    }
}

