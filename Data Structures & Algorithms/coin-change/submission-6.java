class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        int max = amount+1;
        Arrays.fill(dp,max);
        dp[0] =0;
        for(int coin: coins){
        for(int curAmount=1; curAmount<max; curAmount++){ // cal for every amount upto target
             // check each domination for each amount
                if(coin <= curAmount) // if domination <=  cur amount
                    dp[curAmount] = Math.min(dp[curAmount] , dp[curAmount - coin] + 1 );
            }
        }
        return dp[amount] == max ? -1 : dp[amount]; // if never update dp[amount] then return -1
    }
}
