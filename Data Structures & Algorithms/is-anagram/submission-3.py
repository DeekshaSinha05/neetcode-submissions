class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        sn = [0]*26
        tn = [0]*26
        for i in range(len(s)):
            sn[ord(s[i])-ord('a')] += 1
            tn[ord(t[i])-ord('a')] += 1
        for i in range(26):
            if sn[i] != tn[i]:
                return False
        return True