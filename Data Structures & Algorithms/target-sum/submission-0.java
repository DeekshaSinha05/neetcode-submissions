class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int n: nums) sum += n;
        if(Math.abs(target)>sum || (target+sum)%2 != 0 || (target+sum) < 0) return 0;

        int p = (sum + target)/2;
        int[] dp = new int[p+1];
        dp[0] =1;
        for(int n: nums)
            for(int s=p; s>=n; s--)
                dp[s] += dp[s-n];
            
        return dp[p];
    }
}