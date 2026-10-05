class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operators = {"+", "-", "*", "/"}
        stack = []
        for c in tokens:
            if c in operators:
                right = stack.pop()
                left = stack.pop()
                if c == "+":
                    c = left+right
                elif c == "-":
                    c = left-right
                elif c == "*":
                    c = left*right
                elif c == "/":
                    c = abs(left)// abs(right)
                    if(left<0) != (right<0):
                        c = -c
            stack.append(int(c))

        return stack[-1]
