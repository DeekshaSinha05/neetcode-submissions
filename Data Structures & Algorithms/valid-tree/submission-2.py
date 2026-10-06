class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        if len(edges) != n -1:
            return False
        
        graph = [[] for _ in range(n)]
        for start, end in edges:
            graph[start].append(end)
            graph[end].append(start)
        
        visited = set()
        
        def dfs(node):
            if node in visited:
                return
            visited.add(node)
            
            for nei in graph[node]:
                dfs(nei)
        
        dfs(0)
        return len(visited) == n
        
