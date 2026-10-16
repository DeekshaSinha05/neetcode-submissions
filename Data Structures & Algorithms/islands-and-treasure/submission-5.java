class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Deque<int[]> q = new ArrayDeque<>();
        int tr = grid.length;
        int tc = grid[0].length;
        for(int r=0; r<tr; r++){
            for(int c=0; c<tc; c++){
                if(grid[r][c] == 0){
                    int[] pos = new int[2];
                    pos[0] = r;
                    pos[1] = c;
                    q.offer(pos);
                }
            }
        }

        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        while(!q.isEmpty()){
            int[] pos = q.pop();
            int r = pos[0];
            int c = pos[1];
            for(int[] d: directions){
                int nr = r+d[0];
                int nc = c+d[1];
                if(nc<0||nr<0||nc>=tc||nr>=tr|| grid[nr][nc]!=Integer.MAX_VALUE)
                continue;

                q.add(new int[]{nr, nc});
                grid[nr][nc] = grid[r][c] +1;
                
            }
        }
    }
}
