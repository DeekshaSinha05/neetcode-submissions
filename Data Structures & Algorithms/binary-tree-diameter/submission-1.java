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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return d;  
    }
    private int dfs(TreeNode node){
        if(node==null) return 0;
        int depthL = dfs(node.left);
        int depthR = dfs(node.right);
        int height = Math.max(depthL, depthR);
        d = Math.max(d, depthL+depthR);
        return height+1;
    }
    
}
