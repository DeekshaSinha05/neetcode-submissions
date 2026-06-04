class Solution {
    int rows, cols;
    int[][] heights;
    List<List<Integer>> result = new ArrayList<> ();
    int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;
        this.heights = heights;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for(int i=0; i<cols; i++){
           dfs(0, i, pacific);
           dfs(rows-1, i, atlantic);
        }

        for(int i=0; i<rows; i++){
           dfs(i, 0, pacific);
           dfs(i, cols-1, atlantic);
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(pacific[i][j] && atlantic[i][j])
                    result.add(List.of(i,j));
        }
        }
        return result;
    }

    private void dfs(int i, int j, boolean[][] visited){
        if(i<0 || i>=rows || j<0 || j>=cols || visited[i][j]) return;
        visited[i][j] = true;
        int ni, nj;
        for(int[] d: directions){
            ni = i+d[0];
            nj = j+d[1];
            if(ni<0 || ni>=rows || nj<0 || nj>=cols || visited[ni][nj]) continue;
            if(heights[ni][nj] >= heights[i][j])
            dfs(ni, nj, visited);
        }
    return;
    }
}
