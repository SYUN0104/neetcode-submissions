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
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return ans;
    }
    private int depth(TreeNode root){
        if(ans == false) return 0;
        if(root == null) return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        if(Math.abs(left - right) > 1){
            ans = false;
        }

        return Math.max(left, right) + 1;
    }
}
