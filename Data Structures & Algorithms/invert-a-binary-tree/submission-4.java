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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        
        invertTreee(root);
        return root;
    }
    void invertTreee(TreeNode root){
        if(root == null) return; 
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        if(root.left != null || root.right != null){
            invertTreee(root.left);
            invertTreee(root.right);
        }
        
    }
}
