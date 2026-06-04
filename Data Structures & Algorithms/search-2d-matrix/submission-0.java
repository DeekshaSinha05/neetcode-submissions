class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;
        int start = 0;
        int end = rows;
        int mid; 
        int rightRow=0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][cols]){
                rightRow = mid;
                break;
            }
            else if(target<=matrix[mid][cols])
                end = mid-1;
            else if(target>matrix[mid][cols])
                start = mid+1;
            else return false;
        }

        start = 0;
        end = cols;
        
         while(start<=end){
            mid = start+(end-start)/2;
            if(target==matrix[rightRow][mid]){
                return true;
            }
            else if(target<=matrix[rightRow][mid])
                end = mid-1;
            else if(target>matrix[rightRow][mid])
                start = mid+1;
            else return false;
        }

        return false;
    }
}
