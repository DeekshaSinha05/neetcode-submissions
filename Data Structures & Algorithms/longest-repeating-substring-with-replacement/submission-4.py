class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        freq = {}
        l = rs = max_freq = 0
        for r, char in enumerate(s):
            freq[char] = freq.get(char, 0)+1
            
            max_freq = max(max_freq, freq[char])
            
            if r-l+1-max_freq>k:
                freq[s[l]] -= 1
                l += 1
            rs = max(rs, r-l+1)
        return rs