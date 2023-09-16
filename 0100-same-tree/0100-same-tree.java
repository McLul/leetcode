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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if (p == null && q != null || q == null && p != null) { // case : one is null 
           return false;
       } else if (p == null && q == null) {
           return true;
       }
       boolean result = true;
       boolean left = true;
       boolean right = true;
       if (p.val != q.val) {
           return false;
       }
       if (p.left != null && q.left != null) {
           left = isSameTree(p.left,q.left);
       } else if (p.left == null && q.left != null || q.left == null && p.left != null ){
           return false;
       }
       if (p.right != null && q.right != null) {
           right = isSameTree(p.right,q.right);
       } else if (p.right == null && q.right != null || q.right == null && p.right != null ){
           return false;
       }
       return result && left && right ? true : false;
    }
}