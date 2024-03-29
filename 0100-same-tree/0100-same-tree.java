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
       if (p == null && q != null || q == null && p != null) { // case : one of the heads is null
           return false;
       } else if (p == null && q == null) { // case : both are null so its true
           return true;
       }
       boolean result = true;
       boolean left = true;
       boolean right = true;
       if (p.val != q.val) { // case : not equal nodes means not same tree 
           return false;
       }
       left = isSameTree(p.left,q.left);
       right = isSameTree(p.right,q.right);
       return result && left && right; // if any values are false return false
    }
}