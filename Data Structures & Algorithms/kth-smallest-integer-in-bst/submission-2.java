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
    int count;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        if(root == null) return -1;
        return dfs(root, k);
    }

    public int dfs(TreeNode root, int k) {
        int left = -1;
        int right = -1;
        if(root.left != null) 
            left = dfs(root.left, k);
        count++;
        if(count == k) return root.val;
        if(root.right != null) 
            right = dfs(root.right, k);
        return left!=-1?left:right;
    }
}
