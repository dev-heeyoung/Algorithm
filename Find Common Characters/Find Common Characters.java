class Solution {
    public List<String> commonChars(String[] words) {
        
        int[] freq = new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);
        
        List<String> result = new ArrayList<>();
        
        for (String word: words) {
            int[] count = new int[26];
            for (int i=0; i<word.length(); i++) {
                count[word.charAt(i)-'a']++;
            }
            for (int i=0; i<26; i++) {
                freq[i] = Math.min(freq[i], count[i]);
            }
        }
        for (char c='a'; c<='z'; c++) {
            while (freq[c-'a']-- > 0)  result.add("" + c) ;
        }
        
        return result;
    }
}