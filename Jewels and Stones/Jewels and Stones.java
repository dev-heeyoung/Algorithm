class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        
        for(char jewel: jewels.toCharArray())
            set.add(jewel);
        
        for(char stone: stones.toCharArray()) {
            if(set.contains(stone))
               count++;
        }
    
        return count;
    }
}