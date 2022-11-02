class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc]==color) return image;
        recursion(image, sr, sc, image[sr][sc], color);
        return image;
    }
    
    private void recursion(int[][] image, int sr, int sc, int preColor, int color){
        if(image[sr][sc] != preColor || image[sr][sc]== color) return;
        
        image[sr][sc]= color;
    
        int cols = image[0].length-1;
        int rows = image.length-1;
        
        if(sr > 0)
            recursion(image, sr-1, sc, preColor, color);
        if(sc > 0)
            recursion(image, sr, sc-1, preColor, color);
        if(sr < rows)
            recursion(image, sr+1, sc, preColor, color);
        if(sc < cols)
            recursion(image, sr, sc+1, preColor, color);

        return;
    }
}