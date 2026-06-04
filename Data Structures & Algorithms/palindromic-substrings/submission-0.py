class Solution:
    def countSubstrings(self, s: str) -> int:
        count=0
        n=len(s)
        for i in range(0,n):
            l,r = i,i
            count += self.countPalindromes( l, r, s)
            l,r = i,i+1
            count += self.countPalindromes( l, r, s)
        return count

    def countPalindromes(self, l,r, s):
        curCount =0
        while(l>=0 and r<len(s) and s[l]==s[r]):
            curCount += 1
            l -=1
            r +=1
        return curCount



