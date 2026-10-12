class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        smallest = [] # idx means length
       #key idea is smallest is always sorted
        for n in nums:
        # binary-search tails to find the index of the first value in smallest set that is ≥ num.
            l, r = 0, len(smallest)
            while l<r:
                mid = l+(r-l)//2

                if smallest[mid] < n:
                    # Too small to replace: search to the right
                    l = mid+1

                else:
                    # Possible replacement: search for an earlier one
                    r = mid

            if l == len(smallest):
                # num extends the longest subsequence found so far
                smallest.append(n)

            else:
                # Improve the ending value for length l + 1
                smallest[l] = n

        return len(smallest)