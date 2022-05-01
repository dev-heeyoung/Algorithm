class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int posA = a.length() -1;
        int posB = b.length() -1;
        int val = 0, carry = 0;
        
        while(posA >= 0 || posB >= 0) {
            int valueA = posA >=0? a.charAt(posA) - '0' : 0;
            int valueB = posB >=0? b.charAt(posB) - '0' : 0;
            val = (valueA + valueB + carry) % 2;
            carry = (valueA + valueB + carry) / 2;
            result.append(val);
            posA--;
            posB--;
        }
        
        if(carry > 0)
            result.append(carry);
        
        return result.reverse().toString();
    }
}