Solution 1)
class Solution {
    public int fib(int n) {
        if(n==0) 
            return 0;
        if(n==1 || n==2)
            return 1;
        
        int oneBefore = 1;
        int twoBefore = 1;            
        int total = 0;
        
        for(int i=3; i <= n; i++){
            total = oneBefore + twoBefore;
            twoBefore = oneBefore;
            oneBefore = total;
        }
        return total;
    }
}

Solution 2)
class Solution 
{
    public int fib(int n)
    {
        if(n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}