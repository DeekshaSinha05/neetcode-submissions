class Solution {

    public boolean exist(char[][] board, String word) {
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[0].length; c++){
                if(backstrack(board, word, r, c, 0))
                    return true;
            }
        }
        return false;
    }


    private boolean backstrack(char[][] board, String word, int r, int c, int i){
        if(i == word.length()) return true;
        if(r<0 || c<0 || r>=board.length|| c>=board[0].length || board[r][c] == '#' || i>= word.length() ){
            return false;
        }
        if(board[r][c]!= word.charAt(i))
            return false;
        //boolean result = false;
        char temp = board[r][c];
        board[r][c] = '#';
    
        if( backstrack(board, word, r+1, c, i+1)
        ||  backstrack(board, word, r, c+1, i+1)
        || backstrack(board, word, r-1, c, i+1)
        || backstrack(board, word, r, c-1, i+1)){
            board[r][c] = temp;
            
            return true;
            }
        
        board[r][c] = temp;
        //cur.deleteCharAt(cur.length()-1);
        return false;

    }
}
