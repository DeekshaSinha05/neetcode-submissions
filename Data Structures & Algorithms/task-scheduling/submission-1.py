class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        freqArr = [0] * 26
        for t in tasks:
            freqArr[ord(t) - ord('A')] += 1

        freqArr.sort()
        maxFreq = freqArr[25]

        # number of idle slots created by the most frequent task
        idle = (maxFreq - 1) * n

        # fill idle slots using remaining tasks
        for i in range(24, -1, -1):
            # each task can fill at most (maxFreq - 1) gaps
            idle -= min(maxFreq - 1, freqArr[i])

        # total time = tasks + remaining idle slots (if any)
        return max(0, idle) + len(tasks)
