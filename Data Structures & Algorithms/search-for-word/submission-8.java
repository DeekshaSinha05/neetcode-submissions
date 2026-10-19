class Solution {

    public boolean exist(char[][] board, String word) {
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[0].length; c++){
                StringBuffer cur = new StringBuffer();
                if(backstrack(board, word, r, c, cur))
                    return true;
            }
        }
        return false;
    }


    private boolean backstrack(char[][] board, String word, int r, int c, StringBuffer cur){
        if(cur.toString().equals(word))
            return true;
        if(r<0 || c<0 || r>=board.length|| c>=board[0].length || board[r][c] == '#'){
            return false;
        }

        if(cur.length() >= word.length() || 
        board[r][c] != word.charAt(cur.length()))
            return false;
        //boolean result = false;
        char temp = board[r][c];
        cur.append(board[r][c]);
        board[r][c] = '#';
        if( backstrack(board, word, r+1, c, cur)
        ||  backstrack(board, word, r, c+1, cur)
        || backstrack(board, word, r-1, c, cur)
        || backstrack(board, word, r, c-1, cur)){
            board[r][c] = temp;
            cur.deleteCharAt(cur.length()-1);
            return true;
            }
        
        board[r][c] = temp;
        cur.deleteCharAt(cur.length()-1);
        return false;

    }
}
