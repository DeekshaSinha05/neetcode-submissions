# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        pos = {value: i for i, value in enumerate(inorder)}
        idx = 0

        def build(left, right):
            nonlocal idx
            if left > right:
                return None
            
            value = preorder[idx]
            idx += 1
            root = TreeNode(value)
            mid = pos[value]
            root.left = build(left, mid-1)
            root.right = build(mid+1, right)
            return root
        
        return build(0, len(inorder)-1)