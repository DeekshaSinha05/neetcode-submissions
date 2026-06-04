class Solution {
    public int maxProduct(int[] nums) {
        int prefix =1, sufix =1;
        int max=nums[0], n= nums.length;
        for(int i=0; i< n; i++){
            prefix = nums[i]* (prefix==0? 1: prefix);
            sufix = nums[n-1-i]* (sufix==0? 1: sufix);
            max = Math.max(max, Math.max(prefix, sufix));
        }
        return max;
    }
}
