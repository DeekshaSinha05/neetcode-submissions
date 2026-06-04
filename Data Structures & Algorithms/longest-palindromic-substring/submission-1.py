class Solution:
    def longestPalindrome(self, s):
        n = len(s)
        start , maxLen = 0,0
        for i in range (0,n):
            l,r = i,i
            # check odd 
            while(l>=0 and r<n and s[l] == s[r]):
                curLen = r-l+1
                if (curLen > maxLen):
                    maxLen = curLen
                    start = l
                l -=1
                r +=1

            l,r = i,i+1
            # check odd 
            while(l>=0 and r<n and s[l] == s[r]):
                curLen = r-l+1
                if(curLen>maxLen):
                    maxLen = curLen
                    start = l
                l -=1
                r +=1
                
        return s[start : start+maxLen]

        