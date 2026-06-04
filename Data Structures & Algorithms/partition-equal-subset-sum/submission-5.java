class Solution {

    /*
    The intuition is:
If the total sum is S, we want to know whether some subset of the numbers can sum to S / 2.
If yes, then the remaining numbers automatically sum to S / 2, because:

remaining_sum = S - (S/2) = S/2


So the problem reduces to:

Subset Sum = S / 2
*/
    public boolean canPartition(int[] nums) {
        int sum =0;
        for(int n:nums) sum +=n;
        if(sum%2!=0) return false;
        int target = sum/2;

        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        // what new sums become possible if I allow this number
        for(int n:nums){
            // For every possible sum i, 
            //can I form it using this number or not?
            for(int i=target; i>=n; i--){
                    // Either I already knew how to make s without this number
                    // Or I can make s - num, and then add this number
                    dp[i] = dp[i] || dp[i-n]; 
                    if(dp[target] == true) return true;
                    }
        }
        return false;
    }
}
