class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        complementary = {}
        for i in range(len(nums)):
            comp = target - nums[i]
            if comp in complementary:
                return [complementary[comp],i]
            complementary[nums[i]] = i
                