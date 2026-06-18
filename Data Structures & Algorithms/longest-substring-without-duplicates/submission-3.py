class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxlen = 0
        l = 0
        cur = set()
        for r in range (len(s)):
            while s[r] in cur:
                cur.remove(s[l])
                l += 1
            cur.add(s[r])
            curlen = r-l+1
            maxlen = max(maxlen, curlen)
        return maxlen
            



            