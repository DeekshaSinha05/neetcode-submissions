class Solution {
    int maxProfit=0;
    int minSoFar;
    public int maxProfit(int[] prices) {
        minSoFar=prices[0];
        for(int i=1;i<prices.length;i++){
            minSoFar=Math.min(prices[i],minSoFar);
            maxProfit=Math.max(prices[i]-minSoFar,maxProfit);
        }
        return maxProfit;
    }
}
