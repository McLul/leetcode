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
        if (root == null) {
            return root;
        }
        TreeNode placeHolder;
        placeHolder = root.left;
        root.left = root.right;
        root.right = placeHolder;
        if (root.right != null) {
            invertTree(root.right);
        }
        if (root.left != null) {
            invertTree(root.left);
        }
        return root;
    }
}