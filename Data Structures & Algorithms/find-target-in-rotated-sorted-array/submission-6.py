class Solution:
    def search(self, nums: List[int], target: int) -> int:
        s,e = 0, len(nums)-1
        while s<=e:
            mid = s+ (e-s)//2
            if target == nums[mid]:
                return mid
            if nums[s] <= nums[mid]:
                if target>nums[mid] or target< nums[s]:
                    s = mid+1
                else:
                    e = mid-1
            elif target<nums[mid] or target > nums[e]:
                e = mid-1
            else:
                s = mid+1

        return -1