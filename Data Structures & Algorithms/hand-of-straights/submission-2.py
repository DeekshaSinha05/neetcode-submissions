class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        if len(hand)%groupSize: 
            return False
        
        countMap = {}
        for num in hand:
            countMap[num] = 1 + countMap.get(num, 0)

        minH = list(countMap.keys())
        heapq.heapify(minH)
        while minH:
            first = minH[0]
            for i in range(first, first+groupSize):
                if i not in countMap:
                    return False
                countMap[i] -=1
                if countMap[i] ==0:
                    
                    heapq.heappop(minH)
        return True


            

        