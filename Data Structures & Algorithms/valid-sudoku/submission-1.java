
class Solution {
    char[][] board;
    int n;
    int k ;
    public boolean isValidSudoku(char[][] board) {
        n = board.length;
        k = (int) Math.sqrt(n);
        this.board = board;
        // create arrays
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        
        // create Hashset
        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                char cur = board[i][j];
                if(cur == '.') continue;

                int boxIndex = (i/k) * k + (j/k);
                
                if(rows[i].contains(cur) ||
            cols[j].contains(cur) ||
            boxes[boxIndex].contains(cur)) 
                    return false;

            rows[i].add(cur);
            cols[j].add(cur);
            boxes[boxIndex].add(cur);
                
            }
        }
        return true;
    }
}
