class Solution {
    int nr;
    int nc;
    int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    public int maxAreaOfIsland(int[][] grid) {
        nr = grid.length;
        nc = grid[0].length;
        int area = 0;
        int maxArea = 0;

        for(int i =0; i<nr; i++){
          for(int j =0; j<nc; j++){
            if(grid[i][j]==1){
            area = dfs(i, j, grid);
            maxArea = Math.max(maxArea, area);}
        }  
        }
        return maxArea;
    }

    private int dfs(int r, int c, int[][] grid){
        if(r<0 || r>=nr || c<0 || c>=nc || grid[r][c]==0){
            return 0;
        }
        int max = 1;
        grid[r][c] = 0;
        for(int[] d: directions){
            max += dfs(r+d[0], c+d[1], grid);
        }
        return max;
    }
}
