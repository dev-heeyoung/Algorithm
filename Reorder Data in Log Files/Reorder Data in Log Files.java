class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int s1FirstCharIdx = s1.indexOf(' ')+1;
                int s2FirstCharIdx = s2.indexOf(' ')+1;
                
                char s1FirstChar = s1.charAt(s1FirstCharIdx);
                char s2FirstChar = s2.charAt(s2FirstCharIdx);
                
                if (s1FirstChar <= '9') {
                    if (s2FirstChar <= '9') 
                        return 0;
                    else
                        return 1;
                }
                
                if (s2FirstChar <= '9')
                    return -1;
                
                int comStrings = s1.substring(s1FirstCharIdx).compareTo(s2.substring(s2FirstCharIdx));
                
                if(comStrings == 0)
                    return s1.substring(0, s1FirstCharIdx-1).compareTo(s2.substring(0, s2FirstCharIdx-1));
                
                return comStrings;
            }
        };
        Arrays.sort(logs, com);
        return logs;
    }
}