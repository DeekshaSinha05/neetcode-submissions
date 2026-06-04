class Solution:
    def reverse(self, x: int) -> int:
        og = x
        x = abs(x)
        result = int(str(x)[::-1]) # convert it into str and reverse
        if og <0:
            result *=-1
        
        if  result < -(1 << 31) or result > (1 << 31) -1   : 
            return 0
        return result