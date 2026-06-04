class Solution {
    public int maxProfit(int[] prices) {
        // store maxx profit at each action
        int buy = -prices[0];
        int sell = 0;
        int cool = 0;
        for(int i=1; i<prices.length; i++){
            int prevBuy = buy, prevSell = sell, prevCool = cool;
            buy = Math.max(prevBuy, prevCool - prices[i]);
            sell = prevBuy + prices[i];
            cool = Math.max(prevSell, prevCool);
        }
        return Math.max(sell, cool);
    }
}
