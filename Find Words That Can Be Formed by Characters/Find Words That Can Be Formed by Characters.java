class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] countArr = new int[26];
        int res=0;
        
        for(char c: chars.toCharArray()) {
            countArr[c - 'a']++;
        }
        
        for(String word: words) {
            int[] copiedArr = Arrays.copyOf(countArr, 26);
            int tmp = 0;
            
            for(char c: word.toCharArray()) {
                if(copiedArr[c-'a'] > 0){
                    res++; tmp++;
                    copiedArr[c-'a']--;
                }
                else {
                    res -= tmp;
                    break;
                } 
            }
        }
        return res;
    }
}

