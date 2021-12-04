class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        
        for(char c: text.toCharArray())
            letters[c-'a']++;
        
        int min = letters[0];
        min = Math.min(min, letters[1]);
        min = Math.min(min, letters[11]/2);
        min = Math.min(min, letters[13]);
        min = Math.min(min, letters[14]/2);
        
        return min;
        
    }
}
