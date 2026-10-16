class Solution {
    public int orangesRotting(int[][] grid) {
        int tr = grid.length;
        int tc = grid[0].length;
        int min = 0;
        int total_tomatoes = 0;
        Deque<int[]> q = new ArrayDeque<int[]>();
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int r=0; r<tr; r++){
            for(int c=0; c<tc; c++){
                if(grid[r][c] == 2)
                    q.offer(new int[]{r,c});
                if(grid[r][c] == 1)
                    total_tomatoes += 1;
            }
        }
        if(q.isEmpty() && total_tomatoes ==0 ) return 0;
        if(q.isEmpty() && total_tomatoes !=0 ) return -1;

        while(!q.isEmpty()){
            int[] pos = q.poll();
            int r = pos[0];
            int c = pos[1];
            for(int[] d : dirs){
                int nr = r+d[0];
                int nc = c+d[1];
                if(nr<0||nc<0||nr>=tr||nc>=tc||grid[nr][nc]!=1)
                continue;
            
                grid[nr][nc] = grid[r][c]+1;
                q.offer(new int[]{nr, nc});
            }
        }
        for(int r=0; r<tr; r++){
            for(int c=0; c<tc; c++){
                if(grid[r][c] == 1)
                   return -1;
                min = Math.max(min, grid[r][c]);
            }
        }
        return min-2;
    }
}
