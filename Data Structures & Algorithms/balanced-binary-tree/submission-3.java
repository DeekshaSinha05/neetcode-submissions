/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        if(leftHeight == -1 || rightHeight == -1) return false;
        return Math.abs(leftHeight-rightHeight)>1?false:true;
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 1;
        
        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);
        if (Math.abs(leftHeight-rightHeight)>1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
