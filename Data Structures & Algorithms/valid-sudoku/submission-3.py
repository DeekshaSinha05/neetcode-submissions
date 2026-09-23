class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rs = [set() for _ in range(9)]
        cs = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]

        for r in range(9):
            for c in range(9):
                val = board[r][c]

                if val == ".":
                    continue
                
                box_id = (r//3)*3 + (c//3)
                
                if (val in rs[r] or
                val in cs[c] or
                val in boxes[box_id]):
                    return False

                rs[r].add(val)
                cs[c].add(val)
                boxes[box_id].add(val)
        
        return True
