//Solution 1)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        
        return Arrays.equals(arrS, arrT);
    }
}


//Solution 2)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
     
        for(int i: count) {
            if(i !=0) 
                return false;
        }            
        return true;
    }
}