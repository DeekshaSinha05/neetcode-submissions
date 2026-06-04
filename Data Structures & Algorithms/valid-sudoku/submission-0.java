class Solution {
    char[][] board;
    int n;
    public boolean isValidSudoku(char[][] board) {
        n = board.length;
        this.board = board;
        //int c = board[0].length();
        int cur;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                cur = board[i][j];
                if(cur == '.') continue;
                if(checkRowCol(cur,i,j)) return false;
                if(checkBox(cur,i,j)) return false;

            }
        }
        return true;
    }

    private boolean checkRowCol(int cur, int curi, int curj){
        for(int i=0;i<n;i++){
            if((curi != i && cur == board[i][curj] )||
            (curj != i && cur == board[curi][i])){
                return true;
            }
        }
        return false;
    }

    private boolean checkBox(int cur, int curi, int curj){
        int a = (curi/3) * 3;
        int b = (curj/3) * 3;
        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                if((i != curi || j != curj) && cur == board[i][j])
                        return true;
            }
        }
        return false;

    }
}
