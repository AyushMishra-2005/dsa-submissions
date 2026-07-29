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
    int maxFinal;
    public int helper(TreeNode root){
        if(root == null) return 0;

        int leftVal =  helper(root.left);
        int rightVal = helper(root.right);

        maxFinal = Math.max(maxFinal, leftVal + rightVal);

        return Math.max(leftVal, rightVal) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxFinal = 0;
        helper(root);
        return maxFinal;
    }
}



















