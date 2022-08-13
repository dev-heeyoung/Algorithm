// Solution 1)
class Solution {
    public String removeDuplicates(String s) {
        char[] res = s.toCharArray();
        int i=0, j=0, n=s.length();
        
        for (; j < n; ++i, ++j) {
            res[i] = res[j];
            if (i > 0 && res[i] == res[i-1]) {
                i -= 2;
            }
        }
        return new String(res, 0, i);
    }
}

// Solution 2)
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c: s.toCharArray()) {
            int n = sb.length();
            if (n > 0 && c == sb.charAt(n-1))
                sb.deleteCharAt(n-1);
            else 
                sb.append(c);
        }
        return sb.toString();
    }
}