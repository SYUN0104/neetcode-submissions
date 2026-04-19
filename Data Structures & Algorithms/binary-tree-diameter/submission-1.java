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
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depthCal(root);
        return max;
    }
    private int depthCal(TreeNode root){
        if(root == null) return 0;

        int leftDepth = depthCal(root.left);
        int rightDepth = depthCal(root.right);
        
        if(leftDepth + rightDepth > max){
            max = leftDepth + rightDepth;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
