class Solution {
    public int climbStairs(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        
        int oneBefore = 2;
        int twoBefore = 1;
        int total = 0;
                
        for(int i=3; i<=n; i++) {
            total = oneBefore + twoBefore;
            twoBefore = oneBefore;
            oneBefore = total;
        }
        return total;
    }
}