class Solution {
    
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if (grid[i][j]=='1'){
                    //When you encounter land, add one to count and start sinking
                    //all the adjacent land (1s)
                    count++;
                    //Recursively edit the grid after sinking all the land chars
                    //adjacent to this land char
                    grid = coloring(grid, i, j);
                }
            }
        }
        return count;
    }
    
    static char[][] coloring(char[][] grid, int i, int j){
        //Sinking the land (aka marking it at zero)
        if(grid[i][j]=='1') grid[i][j] = '0';
        //If already sunk then return itself
        else return grid;
        //Go all other directions
        if(i>0) grid=coloring(grid,i-1,j);
        if(j>0) grid=coloring(grid,i,j-1);
        if(i<grid.length-1) grid=coloring(grid,i+1,j);
        if(j<grid[0].length-1) grid=coloring(grid,i,j+1);
        return grid;
    }
}
