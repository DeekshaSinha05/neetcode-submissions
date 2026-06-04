class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        lengthMap = {}
        result = []
        for i in range(len(s)):
            lengthMap[s[i]] = i
        size = end = 0
        for i in range(len(s)):
            size +=1
            end = max(end, lengthMap[s[i]])
            if i==end:
                result.append(size)
                size = 0
        return result

        