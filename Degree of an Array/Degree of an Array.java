class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>();
        int degree=0, res=0;
        
        for(int i=0; i<nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
            
            if (count.get(nums[i]) > degree){
                degree = count.get(nums[i]);
                res = i - first.get(nums[i]) + 1;
            } else if (count.get(nums[i]) == degree) {
                res = Math.min(res, i - first.get(nums[i]) + 1);
            }
        }
        return res;
    }
}