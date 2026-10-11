class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1) return nums[0];

        return Math.max(robRange(nums, 0, n-2),
        robRange(nums, 1, n-1));
    }

    private int robRange(int[] nums, int start, int end){
        int pre = 0;
        int cur = 0;
        for(int i = start; i<=end; i++){
            int next = Math.max(cur, pre+nums[i]);
            pre = cur;
            cur = next;
        }
        
        
        return cur;
    }
}
