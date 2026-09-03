class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 0:
            return 0
        elif n == 1:
            return 1
        elif n == 2:
            return 2
        prev, preprev, cur = 2,1,0
        start = 3    
        while start <= n:
            cur = preprev + prev
            preprev = prev
            prev = cur
            start += 1
        return cur