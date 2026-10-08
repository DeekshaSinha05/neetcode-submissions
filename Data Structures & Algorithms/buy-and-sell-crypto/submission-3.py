class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        rs = 0
        lowest = prices[0]
        for p in prices:
            if p<lowest:
                lowest = p
                continue
            rs = max(rs, p-lowest)
        return rs
