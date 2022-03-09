public class Solution {
    private int maxLen =1, start;
    
    public String longestPalindrome(String s){
        
        for(int i=0; i<s.length()-1; i++){
            extendPalindrom(s, i, i);
            extendPalindrom(s, i, i+1);
        }
        
        return s.substring(start, start+maxLen);
        
    }
    
    private void extendPalindrom(String s, int left, int right){
        while (left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        if(maxLen < right - left -1) {
            start = left +1;
            maxLen = right - left -1;
        }
    }
}
