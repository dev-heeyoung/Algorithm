class Solution {
    public int minSwaps(String s) {
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '[')
                count++;
            else {
                if (stackSize > 0)
                    count--;
            }
        }
        return (count+1)/2;
    }
}