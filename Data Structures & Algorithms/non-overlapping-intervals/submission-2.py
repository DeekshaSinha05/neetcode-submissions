class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort()
        rs = 0
        prevEnd = intervals[0][1]

        for start, end in intervals[1:]:
            if start >= prevEnd: # no overlap
                prevEnd = end
            else: # overlap
                rs+=1
                prevEnd = min(end, prevEnd)

        return rs