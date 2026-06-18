class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 0
        max_profit = 0
        while r < len(prices):
            profit = prices[r] - prices[l]
            max_profit = max(max_profit, profit)
            if prices[l] >= prices[r]:
                l = r
            r = r+1
        return max_profit
                
            