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
    public int sumRootToLeaf(TreeNode root) {
        int solution = recursiveTraverseDFS(0, root);
        return solution;
    }
    private int recursiveTraverseDFS(int val, TreeNode root) {
        int total = 0;
        val = (val << 1) + root.val;
        if(root.left != null) {total += recursiveTraverseDFS(val, root.left);}
        if(root.right != null) {total += recursiveTraverseDFS(val, root.right);}
        if(root.left == null && root.right == null) {
            return val;
        }
        return total;
    }
}