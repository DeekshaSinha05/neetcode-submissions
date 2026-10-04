class Solution:
    def isValid(self, s: str) -> bool:
        bracket_map = {")": "(", "}": "{", "]": "[" }
        stack = []
        for c in s:
            if c not in bracket_map: # i.e c is not closing 
                stack.append(c)
                continue
            # if closing
            if not stack or stack[-1] != bracket_map[c]:
                return False
            # matches
            stack.pop()
                    
        return not stack
