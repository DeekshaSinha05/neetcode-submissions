class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nSet = set(nums)
        maxlen = 0
        for n in nSet:
            if (n-1) not in nSet:
                length = 1
                while n+1 in nSet:
                    length += 1
                    n +=1
                
                maxlen = max(maxlen, length)
        return maxlen
            

