class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        // Map<> adj = new HashMap<>();
        Queue<int[]> q = new LinkedList<> ();
         for(int i=0; i<rows ;i++){
            for(int j=0; j<cols ;j++){
               if(grid[i][j] == 0)
                    q.add(new int[] {i,j});

        }
        } 

        int [][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        int level =1;
        int levelSize =0;
        int[] cur = new int[2];
        while(!q.isEmpty()){
            levelSize = q.size();
            while(levelSize-->0){
                cur = q.poll();
                for(int[] d: directions){
                    int ni = cur[0]+d[0];
                    int nj = cur[1]+d[1];
                    if(ni < 0 || ni >= rows 
                    || nj < 0 || nj >= cols 
                    || grid[ni][nj]==-1 
                    || grid[ni][nj]!= Integer.MAX_VALUE) continue;
                     grid[ni][nj] = grid[cur[0]][cur[1]] +1;
                     q.add(new int[]{ni,nj});
                }

            }
            level++;
        }
    }
}
