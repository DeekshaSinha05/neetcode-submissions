class Solution:
    def isValid(self, s: str) -> bool:
        stk = []
        
        for c in s:
            if c in ("[","{","("):
                stk.append(c)
                continue
            elif not stk:
                return False
            elif c == "]" and stk[-1] != "[" :
                return False
            elif c == "}" and stk[-1] != "{" :
                return False
            elif c == ")" and stk[-1] != "(" : 
                return False
            if stk:
                stk.pop()
        if len(stk) != 0:
            return False
        return True
