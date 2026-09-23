class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        freq = [[] for i in range(len(nums)+1)] # the len of freq could be the length that would be when each element is the same number
        
        # count freq of each number
        for n in nums:
            count[n] = count.get(n, 0) + 1

        # put each number in its frequency bucket
        for n, c in count.items():
            freq[c].append(n)

        res = []

        # read buckets from highest frequescy to lowest
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res

        