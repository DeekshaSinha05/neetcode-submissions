class Solution {

    int rows, cols;
    char[][] board;
    List<List<Integer>> result = new ArrayList<> ();
    int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        this.board = board;
        boolean[][] visited = new boolean[rows][cols];


        for(int i=0; i<cols; i++){
           dfs(0, i, visited);
           dfs(rows-1, i, visited);
        }

        for(int i=0; i<rows; i++){
           dfs(i, 0, visited);
           dfs(i, cols-1, visited);
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(!visited[i][j] && board[i][j]=='O')
                    board[i][j]='X';
                  
        }
        }
        return ;
    }

    private void dfs(int i, int j, boolean[][] visited){
        if(i<0 || i>=rows || j<0 || j>=cols || visited[i][j]) return;
        if(board[i][j]!='O') return;
        visited[i][j] = true;
        int ni, nj;
        for(int[] d: directions){
            ni = i+d[0];
            nj = j+d[1];
            dfs(ni, nj, visited);
        }
    return;    
        
    }
}
