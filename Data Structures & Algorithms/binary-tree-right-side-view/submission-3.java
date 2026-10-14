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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideElements = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode> ();
        if (root == null)
            return rightSideElements;
        q.offer(root);
        
        while(!q.isEmpty()){
            int levelSize = q.size(); 
            TreeNode element = new TreeNode();
            for(int i=0; i<levelSize; i++){
                element = q.poll();
                if(element.left!=null) q.offer(element.left);
                if(element.right!=null) q.offer(element.right);
            }
            rightSideElements.add(element.val);
        }
        return rightSideElements;
    }
}
