class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda pair:pair[0])
        rs = [intervals[0]]

        for start, end in intervals:
            prevEnd = rs[-1][1]
            if start<=prevEnd:
                rs[-1][1] = max(end, prevEnd)

            else:
                rs.append([start, end])
        return rs