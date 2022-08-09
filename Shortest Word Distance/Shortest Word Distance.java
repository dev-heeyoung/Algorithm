class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int i1 = -1, i2 = -1;
        int minDistance = wordsDict.length;
        
        for (int i=0; i<wordsDict.length; i++) {
            if (wordsDict[i].equals(word1))
                i1 = i;
            else if (wordsDict[i].equals(word2))
                i2 = i;
            if (i1 != -1 && i2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(i1-i2));
            } 
        }
        return minDistance;
    }
}
