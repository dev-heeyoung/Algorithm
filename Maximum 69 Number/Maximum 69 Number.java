class Solution {
    public int maximum69Number (int num) {
        String tmp = Integer.toString(num);
        char[] numChar = tmp.toCharArray();
        for(int i=0; i<numChar.length; i++) {
            if(numChar[i]=='6') {
                numChar[i]='9';
                return Integer.parseInt(new String(numChar));
            }
        }
        return num;
    }
}