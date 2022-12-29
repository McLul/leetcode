import java.lang.Math;

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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return depthOfNode(root) + 1;
    }
    private int depthOfNode(TreeNode node) {
        int leftDepth = 0;
        int rightDepth = 0;
        if (node.left != null) {
            leftDepth += 1 + depthOfNode(node.left);  
        }
        if (node.right != null) {
            rightDepth += 1 + depthOfNode(node.right);
        }
        return Math.max(leftDepth,rightDepth);

    }
}