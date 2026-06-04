class Solution {

    char[][] board;
    String word;
    int nr, nc;
    int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        
        nr = board.length;
        nc = board[0].length;

        for(int i =0; i<nr; i++){
            for(int j =0; j<nc; j++){
                if(dfs(i, j, 0)) return true;
            
            }
        }
        return false;
    }

    private boolean dfs(int r, int c, int index){
        if(index == word.length()) return true;
        if(r<0 || c<0 || r>=nr || c>=nc) return false;
        if(word.charAt(index) != board[r][c]) return false;
        char tmp = board[r][c];
        board[r][c] = '#';

        for (int[] d: directions)
            if(dfs(r+d[0], c+d[1], index+1)) {
                board[r][c] = tmp;
                return true;
            }

        board[r][c] = tmp;
        return false;
    }
}
