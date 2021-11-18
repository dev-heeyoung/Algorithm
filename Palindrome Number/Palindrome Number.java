class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int y = x;
        int revert = 0;
        
        while(y>0){
            revert = revert*10 + y%10;
            y /= 10;
        }
        return x == revert;
    }
}