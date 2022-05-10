class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    recursion(i, j, grid);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }
    
    public void recursion(int i, int j, char[][] grid){
        if (i<0 || j<0 || i>=grid.length || j >=grid[0].length || grid[i][j] == '0') 
            return;
        
        grid[i][j] = '0';
        
        recursion(i+1, j, grid);
        recursion(i, j-1, grid);
        recursion(i-1, j, grid);
        recursion(i, j+1, grid);
    }
}