class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int mid = 0;
        while (start<end){
            mid = start+(end-start)/2;
            if(nums[end] < nums[mid])
                start = mid+1; 
            else
                end = mid;
            } 
        return nums[start];
        }
        
}
