class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int tmp = 1;
        
        for(int i=0; i<len; i++){
            res[i] = tmp;
            tmp *= nums[i];
        }
        
        tmp = 1;
        for(int i=len-1; i >=0; i--){
            res[i] *= tmp;
            tmp *= nums[i];
        }
        
        return res;
    }
}
