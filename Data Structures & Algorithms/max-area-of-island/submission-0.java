class Solution {
    int[][] grid;
    int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    int r,c;
    int curArea, maxArea=0;
    int[][] visited;
    
    public int maxAreaOfIsland(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        visited= new int[r][c];
        this.grid = grid;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                curArea=0;
                if(grid[i][j]==1 && visited[i][j]!=1)
                dfs(i,j);
                maxArea = Math.max(maxArea, curArea);
            }
        }
        return maxArea;
    }

    private void dfs(int i, int j){
        if(i<0 || j<0 || i>=r || j>=c|| visited[i][j]==1) return;
        if(grid[i][j]==1){
        curArea++;
        visited[i][j]=1;
        for(int[] d:directions){
            dfs(i-d[0],j-d[1]);
        }
        }
        return;

    }
}
