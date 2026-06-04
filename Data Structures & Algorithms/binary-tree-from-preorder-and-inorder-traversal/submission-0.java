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
    Map<Integer,Integer> inorderMap = new HashMap<> ();
    int id =0;
    int [] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i =0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
         return arrayToTree(0, preorder.length-1);
        
    }
    private TreeNode arrayToTree( int start, int end ){
        if(start>end) return null;
        TreeNode node = new TreeNode();
        node.val = preorder[id++];
        node.left = arrayToTree(start, inorderMap.get(node.val)-1);
        node.right = arrayToTree(inorderMap.get(node.val)+1, end);
        return node;

    }
}
