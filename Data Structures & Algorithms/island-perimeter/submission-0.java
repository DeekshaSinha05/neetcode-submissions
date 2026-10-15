class Solution {
    public int islandPerimeter(int[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int res = 0;
        for (int i =0; i<nr; i++){
            for (int j =0; j<nc; j++){
                if(grid[i][j] == 1){
                    res += ( i+1>=nr || grid[i+1][j]==0) ? 1:0;
                    res += ( i-1<0 || grid[i-1][j]==0) ? 1:0;
                    res += ( j+1>=nc || grid[i][j+1]==0) ? 1:0;
                    res += ( j-1<0 || grid[i][j-1]==0) ? 1:0;
                }
        }
        }
        return res;
    }
}