class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        int carry = 0, v1 = 0, v2 = 0, value = 0;
        
        while(p1>=0 || p2>=0) {
            v1 = p1 >=0 ? num1.charAt(p1) - '0' : 0;
            v2 = p2 >=0 ? num2.charAt(p2) - '0' : 0;
            value = (v1 + v2 + carry) % 10;
            carry = (v1 + v2 + carry) / 10;
            res.append(value);
            p1--;
            p2--;
        }
        if(carry>0)
            res.append(carry);
       
        return res.reverse().toString();
    }
}