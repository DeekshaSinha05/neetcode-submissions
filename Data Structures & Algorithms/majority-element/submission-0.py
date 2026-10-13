class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        res = count = 0
        for n in nums:
            if count == 0:
                res = n
            count = (count+1) if n==res else (count-1)
        
        return res