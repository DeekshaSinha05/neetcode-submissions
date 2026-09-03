class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        preprev, prev = 0,0
        for c in cost:
            cur = c + min(preprev, prev)
            preprev, prev = prev, cur
        return min(preprev, prev)