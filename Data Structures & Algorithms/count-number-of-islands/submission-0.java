class Solution {
    int r;
    int c;
    char[][] grid;
    int count=0;
    int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    
    public int numIslands(char[][] grid) {
       r= grid.length;
       c= grid[0].length;
       this.grid = grid;
       for(int i=0; i<r;i++) {
        for(int j=0; j<c;j++){
            if(grid[i][j]=='1'){
                count++;
                dfs(i,j);
            }
        }
       }
       return count;
    }

    private void dfs(int i, int j){
        if(i>=r||j>=c||i<0||j<0||grid[i][j]!='1') return;
        grid[i][j]='2';
        for(int[] d : directions){
             dfs(i+d[0],j+d[1]);
        }
        return;
    }
}
