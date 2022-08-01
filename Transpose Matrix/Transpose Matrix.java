class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowLen = matrix[0].length; 
        int colLen = matrix.length;
        int[][] result = new int[rowLen][colLen];
        
        for(int i=0; i<rowLen; i++) {
            for (int j=0; j<colLen; j++) {
                result[i][j] = matrix[j][i]; 
            }
        }
        return result;
    }
}