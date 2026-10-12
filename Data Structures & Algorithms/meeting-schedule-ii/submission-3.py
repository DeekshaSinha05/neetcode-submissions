"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        events = []
        for i in intervals:
            events.append((i.start, 1))
            events.append((i.end, -1))
        events.sort()

        count = rs = 0
        for time, change in events:
            count += change
            rs = max(rs, count)
        
        return rs