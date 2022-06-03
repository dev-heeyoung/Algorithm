class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-1; i++) {
            int j= i+1, k=nums.length-1;
            int newTarget = 0 - nums[i];
            
            if(i>0 && nums[i] == nums[i-1]) continue;
            
            while (j<k) {
                if (nums[j] + nums[k] == newTarget) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    while(j<k && nums[k] == nums[k-1]) k--;
                    while(j<k && nums[j] == nums[j+1]) j++;
                    
                    j++;
                    k--;
                
                } else if (nums[j] + nums[k] > newTarget) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        
        return result;
    }
}