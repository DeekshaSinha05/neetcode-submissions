"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        new = {}
        def dfs(node):
            if node in new:
                return new[node]
        
            copy_node = Node(node.val)
            new[node] = copy_node
            for nei in node.neighbors:
                copy_node.neighbors.append(dfs(nei))
            
            return copy_node
        
        return dfs(node) if node else None
        