class Solution {
    public String decodeString(String s) {
       
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int k=0;
        
        for (char ch: s.toCharArray()) {
            if (Character.isk(ch)) {
                k = k * 10 + ch - '0';
            } 
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(cur);
                cur = new StringBuilder();
                k = 0;
            } 
            else if (ch == ']') {
                StringBuilder tmp = cur; 
                cur = stringStack.pop();
                
                for (int i=countStack.pop(); i> 0; --i) {
                    cur.append(tmp);
                }
            } 
            else {
                cur.append(ch);
            }
        }
        
        return cur.toString();
    }
}