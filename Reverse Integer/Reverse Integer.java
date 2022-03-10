class Solution {
    public int reverse(int x) {
        int res = 0;
            
        while( x != 0) {
            int tail = x % 10;
            int checkRes = res * 10 + tail;
            if(checkRes / 10 != res)
                return 0;
            res = checkRes;
            x= x/10;
        }
        return res;
    }
}
