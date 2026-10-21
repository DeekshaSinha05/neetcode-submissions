class NumArray {
        Map<Integer, Integer> prefix;

   public NumArray(int[] nums) {
        prefix = new HashMap<>();
        int curSum = 0;
        for(int i = 0; i<nums.length; i++){
            curSum += nums[i];
            prefix.put(i,curSum);
        }
    }
    
    public int sumRange(int left, int right) {
        int res = 0;
        if(left != 0)
            res = prefix.get(right)-prefix.get(left-1);
        else
            res = prefix.get(right);

        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */