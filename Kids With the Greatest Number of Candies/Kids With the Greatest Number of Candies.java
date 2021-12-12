class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        
        int max = candies[0];
        
        for(int candy : candies){
            max = Math.max(max,candy);
        }
        
        max -= extraCandies;
        
        for(int i=0; i<candies.length; i++) {
                list.add(candies[i] >= max);
        }
        
        return list;
        
    }
}

