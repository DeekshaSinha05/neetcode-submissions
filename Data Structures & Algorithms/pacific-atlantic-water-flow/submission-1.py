class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        rows, cols = len(heights), len(heights[0])
        pac, alt = set(), set()


        directions = ((1,0), (0,1), (-1,0), (0,-1))
        def dfs(r, c, visited, prev):
            if ((r,c) in visited
            or r < 0
            or r >= rows
            or c < 0
            or c >= cols
            or heights[r][c] < prev
            ):
                return
            visited.add((r, c))
            for dr,dc in directions:
                dfs(r+dr,c+dc, visited, heights[r][c])
            
        for c in range(cols):
            dfs(0, c, pac, heights[0][c])
            dfs(rows-1, c, alt, heights[rows-1][c])

        for r in range(rows):
            dfs(r, 0, pac, heights[r][0])
            dfs(r, cols-1, alt, heights[r][cols-1])

        result = []
        for r in range(rows):
            for c in range(cols):
                if (r,c) in pac and (r,c) in alt:
                    result.append([r,c])
        return result    
        
