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
    private boolean check = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        checkSame(p, q);
        return check;
    }

    private void checkSame(TreeNode p, TreeNode q){
        if(check == false){
            return;
        }
        if(p == null && q != null || p != null && q == null){
            check = false;
            return;
        }
        if(p == null && q == null){
            return;
        }
        if(p.val != q.val){
            check = false;
            return;
        }
        checkSame(p.left, q.left);
        checkSame(p.right, q.right);
    }
}
