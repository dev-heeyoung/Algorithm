public class Solution {
    public String reverseWords(String s) {
        char[] charArr = s.toCharArray();
        int j=-1;
        for (int i=0; i<s.length(); i++) {
            if(charArr[i] != ' ') {
                j=i;
                while(j+1 <s.length() && charArr[j+1] !=' ') j++;
                reverse(charArr, i, j);
                i=j;
            }
        }
        return new String(charArr);
    }
    
    private void reverse(char[] charArr, int i, int j) {
        char tmp;
        for(; i<j; i++, j--) {
            tmp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = tmp;
        }
    }
}