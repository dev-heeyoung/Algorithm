class Solution {
    public int minAddToMakeValid(String s) {
        int count =0, stackSize =0;
        
        for (int i=0; i<s.length(); i++) {            
            if (s.charAt(i) == '('){
                count++;
                stackSize++;
            }
            else {
                if (stackSize < 1)
                    count++;
                else {
                    count--;
                    stackSize--;
                }
            }
        }
        return Math.abs(count);
    }
}