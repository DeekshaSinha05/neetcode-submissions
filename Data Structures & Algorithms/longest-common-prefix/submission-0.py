class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        curr = strs[0]
        for s in strs[1:]:
            while not s.startswith(curr):
                curr = curr[:-1]
                if not curr:
                    return ""
        return curr

        