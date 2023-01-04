class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        Set<Integer> set = new HashSet<>();

        for(int num: aliceSizes){
            sum1 += num;
            set.add(num);
        }
        for(int num: bobSizes) {
            sum2 += num;
        }
            
        int mid = (sum1-sum2)/2;

        for(int num: bobSizes) {
            if(set.contains(num+mid)) 
                return new int[]{num+mid, num};
        }
        return new int[0];
    }
}