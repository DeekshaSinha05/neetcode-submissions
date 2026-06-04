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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>  q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> level = new ArrayList<>();
            while(levelsize-->0){
                TreeNode cur = q.poll();
                level.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            result.add(level);
        }
       return result;
    }
}
