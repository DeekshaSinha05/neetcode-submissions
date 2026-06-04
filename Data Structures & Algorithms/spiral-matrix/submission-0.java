class Solution {
   public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> res = new ArrayList<> ();
        int top = 0, left = 0, bottom= matrix.length-1, right= matrix[0].length-1;
        List<Integer> result  = new ArrayList<>();
        while(left<=right && top<=bottom){ // inner to outter layer of the square
            for(int col= left; col<=right; col++){
               result.add(matrix[top][col]);
            }
            top++;
            for(int row= top; row<=bottom; row++){
               result.add(matrix[row][right]);
            }
            right--;
            if(top<=bottom){
            for(int col= right; col>=left; col--){
               result.add(matrix[bottom][col]);
            }
            bottom--;
            }
            if(left<=right){
            for(int row= bottom; row>=top; row--){
               result.add(matrix[row][left]);
            }
            left++;  }        
        }
        return result;
    }
}
