class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        neighboursMap = collections.defaultdict(list)
        for u, v, wt in times:
            neighboursMap[u].append((v, wt))

        minHeap = [(0, k)] # souce K, wt 0
        visitesSet = set()
        maxWt = 0
        while minHeap:
            curWt, cur = heapq.heappop(minHeap)
            if cur in visitesSet:
                continue
            visitesSet.add(cur)
            maxWt = curWt

            for nei, neiWt in neighboursMap[cur]:
                if nei not in visitesSet:
                    heapq.heappush(minHeap, (curWt + neiWt, nei)) # overrides any existing wt
        return maxWt if len(visitesSet)== n else -1