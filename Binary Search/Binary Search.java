class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 0) return -1;
        int start =0, end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] > target){
                end = mid-1;
            }   
            else if (nums[mid] < target) {
                start = mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}