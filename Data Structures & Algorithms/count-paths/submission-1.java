class Solution {
    public int uniquePaths(int m, int n) {
        //int[][] dp = new int[m][n]; Optimise this as we need or previous row and left info
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for(int i=1; i<m; i++) // cols
            for(int j=1; j<n; j++)// rows
                // storing just curent row 
                //          dp[i] actually holds top value
                //                   dp[j-1] left value
                dp[j] = dp[j] + dp[j-1];
        // dp represents the last row of the original 2D DP table.
    return dp[n-1];         
    }
}
