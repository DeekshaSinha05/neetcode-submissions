class Solution {
  public void setZeroes(int[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;
    
    boolean firstColZero = false; 

    // Essentially, we mark the rows and columns that are to be made zero
    for (int i = 0; i < R; i++) {
        if(matrix[i][0] == 0 ) firstColZero = true;
        for (int j = 1; j < C; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
        }
      }
    }

    // Iterate over the array once again and using the rows and cols sets, update the elements.
    for (int i = R-1; i >=0; i--) {
      for (int j = C-1; j >= 1; j--) {
        if (matrix[i][0] == 0 || matrix[0][j] ==0) {
          matrix[i][j] = 0;
        }
      }
        if(firstColZero){
            matrix[i][0]=0;
        }
    
    }
  }
}