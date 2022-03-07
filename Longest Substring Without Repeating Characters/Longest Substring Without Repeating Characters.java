Solution 1) HashSet
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashSet<Character> set = new HashSet();
        int max=0, i=0, j=0;
        
        while(i<s.length()) {
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j++));          
            }
            else {
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            }
        }
        return max;    
    }
}

Solution 2) HashMap
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int j=0, i=0; j<s.length(); ++j){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j),j);
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}