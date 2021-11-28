class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        
        for(int num: nums1)
            set.add(num);
        
        for(int num: nums2){
            if(set.contains(num))
                intersect.add(num);
        }
        
        int[] res = new int[intersect.size()];
        
        int i=0;
        for(int num: intersect)
            res[i++]=num;
        
        return res;
    }
}