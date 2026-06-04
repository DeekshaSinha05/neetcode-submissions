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
        if(root==null) return true;
        return (dfs(root)>=0);
    }

    private int dfs(TreeNode node){
        if(node==null) return 0;
        int depthL = dfs(node.left);
        int depthR = dfs(node.right);
        if(depthL == -1 || depthR == -1) return -1;
        if(Math.abs(depthL-depthR)>1) return -1;
        return Math.max(depthL,depthR)+1;
    }
}
