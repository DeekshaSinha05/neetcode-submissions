class Solution:
    def hammingWeight(self, n: int) -> int:
        rs = 0
        while n:
            n &= n-1
            rs += 1
        return rs