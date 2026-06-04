class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] =1;
        for(int coin: coins){ // cal for every amount upto target
            for(int curAmount=coin; curAmount<=amount; curAmount++){ // check each domination for each amount
                dp[curAmount] += dp[curAmount - coin];
            }
        }
        return dp[amount]; // if never update dp[amount] then return -1
     
    }
}
