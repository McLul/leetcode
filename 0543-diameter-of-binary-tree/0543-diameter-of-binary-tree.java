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
    private int greatestLeftDepth = 0;
    private int greatestRightDepth = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        findLongestRoute(root);
        return this.greatestLeftDepth + this.greatestRightDepth;
    }
    private int findLongestRoute (TreeNode node) {
        int leftDepth = 0;
        int rightDepth = 0;
        if (node.left != null) {
            leftDepth += 1 + findLongestRoute(node.left);
        }
        if (node.right != null) {
            rightDepth += 1 + findLongestRoute(node.right);
        }
        if (leftDepth+rightDepth > greatestLeftDepth+greatestRightDepth) {
            this.greatestLeftDepth = leftDepth;
            this.greatestRightDepth = rightDepth;
        }
        return Math.max(leftDepth,rightDepth);
    }
}