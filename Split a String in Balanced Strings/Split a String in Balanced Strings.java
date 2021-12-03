class Solution {
    publice int balancedStringSplit(String s) {
        int res = 0, count = 0;       
        
        for(char c: s.toCharArray()) {
            if(c=='L') count--;
            else count++;
            if(count==0) res++;
        }
        
        return res;
    }
}