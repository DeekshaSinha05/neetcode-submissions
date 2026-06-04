class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        freqArr = [0] * 26
        for t in tasks:
            freqArr[ord(t) - ord('A')] +=1

        freqArr.sort()
        maxFreq = freqArr[25]
        idle = (maxFreq - 1) * n
        for i in range(24, -1, -1):
            idle -= min(maxFreq -1, freqArr[i])
        return max(0, idle)+ len(tasks)
