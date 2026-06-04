class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh =0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    }
                if(grid[i][j]==1){
                    fresh++;
                    }

        }
        }
        if(fresh==0) return 0;
        int levelSize =0;
        int level =0;
        int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        int[] cur = new int[2];
        while(!q.isEmpty()){
            levelSize = q.size();
            while(levelSize-->0){
                cur = q.poll();
                int i = cur[0];
                int j = cur[1];
                for(int[] d: directions){
                    int ni =i+d[0], nj=j+d[1];
                    if(ni<0 ||ni>=r ||nj<0 || nj>=c) continue;
                    if(grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        q.add(new int[]{ni,nj});
                        fresh--;
                        }
                }

            }
            level++;

        }

        /*for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]==1)
                    return -1;

        }
        }*/
    return fresh > 0 ? -1 : level-1;
    }
}
