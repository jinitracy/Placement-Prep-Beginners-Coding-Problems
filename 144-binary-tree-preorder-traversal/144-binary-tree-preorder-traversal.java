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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> op=new ArrayList<Integer>();
        preorder(root,op);
        return op;
        
    }
    
    public void preorder(TreeNode root, List<Integer> op){
        if(root==null){
            return;
        }
        op.add(root.val);
        preorder(root.left,op);
        preorder(root.right,op);
    }
}