class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++) {
            for (int j=0, k=image[0].length-1; j<=k; j++, k--) {
                if (image[i][j] == image[i][k]) {
                    image[i][j] = (image[i][j]+1) % 2;
                    image[i][k] = (image[i][k]+1) % 2;
                    
                    if (j==k) 
                        image[i][j] = (image[i][j]+1) % 2;
                }
            }
        }
        return image;
    }
}