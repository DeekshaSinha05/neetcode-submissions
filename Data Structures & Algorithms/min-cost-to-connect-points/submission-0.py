class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:
        n = len(points)
        adjMap = {i: [] for i in range(n)}
        for i in range(n):
            x1, y1 = points[i]
            for j in range(i+1, n):
                x2, y2 = points[j]
                curDistance = abs(x1-x2) + abs(y1-y2)
                adjMap[i].append([curDistance, j])
                adjMap[j].append([curDistance, i])
        
        result = 0
        visitedSet = set()
        minHeap = [(0,0)]
        while len(visitedSet) < n:
            cost, i = heapq.heappop(minHeap)
            if i in visitedSet:
                continue
            result += cost
            visitedSet.add(i)
            for neiCost, nei in adjMap[i]:
                if nei not in visitedSet:
                    heapq.heappush(minHeap, [neiCost, nei])
        
        return result