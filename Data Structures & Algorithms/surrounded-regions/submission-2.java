class Solution {
    char[][] updatedBoard;
    int[][] direcs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    int tr;
    int tc;
    public void solve(char[][] board) {
        updatedBoard = board;
        tr = updatedBoard.length;
        tc = updatedBoard[0].length;
        for(int r=0; r<tr; r++){
            for(int c=0; c<tc; c++){
                if(r==0||c==0||r==tr-1||c==tc-1){
                    if(updatedBoard[r][c]=='O'){
                        dfs(r, c);
                    }
                    

                }
        }
        }

        for(int r=0; r<tr; r++){
            for(int c=0; c<tc; c++){
                
                    if(updatedBoard[r][c]=='O'){
                       updatedBoard[r][c]='X';
                    }
                    

                
        }
        }

        for(int r=0; r<tr; r++){
            for(int c=0; c<tc; c++){
                
                    if(updatedBoard[r][c]=='T'){
                       updatedBoard[r][c]='O';
                    }
                    

                
        }

        }
    
    }
        private void dfs(int r, int c){
            if(r<0||c<0||r>tr-1||c>tc-1||updatedBoard[r][c]!='O'){
                return;
            }
            if(updatedBoard[r][c]=='O')
                updatedBoard[r][c]='T';
        
        
        for(int[] d: direcs){
            dfs(r+d[0], c+d[1]);
        }

    }
}
