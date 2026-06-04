class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        int max = amount+1;
        Arrays.fill(dp,max);
        dp[0] =0;
        for(int curAmount=1; curAmount<max; curAmount++){ // cal for every amount upto target
            for(int j=0; j<coins.length; j++){ // check each domination for each amount
                if(coins[j] <= curAmount) // if domination <=  cur amount
                    dp[curAmount] = Math.min(dp[curAmount] , dp[curAmount - coins[j]] + 1 );
            }
        }
        return dp[amount] == max ? -1 : dp[amount]; // if never update dp[amount] then return -1
    }
}
