class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = []
        seen = {}
        for i, n in enumerate(nums):
            comp = target - n
            if comp in seen:
                ans.append(seen[comp])
                ans.append(i)
                return ans
            seen[n] = i
        return ans
