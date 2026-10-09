# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        
        def flatten(node, rs):
            if node is None:
                rs.append(None)
                return
            rs.append(node.val)
            flatten(node.left, rs)
            flatten(node.right, rs)

        rootstr, substr = [], []
        flatten(root, rootstr)
        flatten(subRoot, substr)

        prefix = [0] * len(substr)
        matched = 0

        for i in range(1, len(substr)):
            while matched and substr[i] != substr[matched]:
                matched = prefix[matched - 1]
            
            if substr[i] == substr[matched]:
                matched += 1
            prefix[i] = matched
        
        matched=0
        for value in rootstr:
            while matched and value!= substr[matched]:
                matched = prefix[matched-1]
            if value == substr[matched]:
                matched += 1
            if matched == len(substr):
                return True
        return False
