class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(i=0; i<nums.length && nums[i] <= target ; i++){
            if(nums[i] == target)
                return i;
        }
        return i;
    }
}