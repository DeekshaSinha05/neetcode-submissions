class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int i = rob(nums, 1, nums.length-1);
        int j = rob(nums, 0, nums.length-2);
        return Math.max(i,j);
    }
    
    private int rob(int[] nums, int start, int end) {
       int prev2 = 0, prev1 = 0;
       for(int i=start; i<=end; i++){
            int cur = Math.max(prev1, prev2+nums[i]);
            prev2 = prev1;
            prev1 = cur;
       }
       return prev1;
    }
}
