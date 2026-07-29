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
    boolean balanced;
    int helper(TreeNode root){
        if(root == null) return 0;
        if(balanced == false){
            return 0;
        }

        int leftVal = helper(root.left);
        int rightVal = helper(root.right);

        if(Math.abs(leftVal - rightVal) > 1){
            balanced = false;
        }

        return  Math.max(leftVal, rightVal) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        balanced = true;
        helper(root);
        return balanced;
    }
}


















