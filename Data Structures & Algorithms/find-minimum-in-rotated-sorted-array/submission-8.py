class Solution:
    def findMin(self, nums: List[int]) -> int:
        s,e = 0, len(nums)-1
        cur_min = float("inf")
        while s<e:
            mid = s+ (e-s)//2
            cur_min = min(cur_min, nums[mid])
            if nums[mid] > nums[e]:
                s = mid+1
            else:
                e = mid-1

        return min(cur_min, nums[s])