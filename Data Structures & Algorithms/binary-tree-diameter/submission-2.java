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
    int totalMax =0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return totalMax;
    }

    private int dfs(TreeNode node ) {
        if (node == null)
            return 0;
        
        int maxL = dfs(node.left);
        int maxR = dfs(node.right);
        totalMax = Math.max(totalMax,maxL+ maxR);

        return Math.max(maxL, maxR)+1;
        
    }
}
