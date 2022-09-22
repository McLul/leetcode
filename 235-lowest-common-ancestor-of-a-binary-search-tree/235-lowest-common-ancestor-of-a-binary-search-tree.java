/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private void findAncestors(TreeNode start, TreeNode searchedNode, ArrayList<TreeNode> ancestors) {
            ancestors.add(start);
            if (start.val > searchedNode.val) {
                findAncestors(start.left, searchedNode, ancestors);
            }  else if (start.val < searchedNode.val) {
                findAncestors(start.right, searchedNode, ancestors);
            }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pAncestors = new ArrayList<TreeNode>();
        ArrayList<TreeNode> qAncestors = new ArrayList<TreeNode>();
        findAncestors(root, p, pAncestors);
        findAncestors(root, q, qAncestors);
        ArrayList<TreeNode> smallerNodeList = p.val > q.val ? qAncestors : pAncestors;
        ArrayList<TreeNode> largerNodeList = p.val > q.val ? pAncestors : qAncestors;
        for (int i = smallerNodeList.size()-1; i >= 0 ; i--) {
            for (int ii = largerNodeList.size()-1; ii >= 0 ; ii--) {
                if (smallerNodeList.get(i) == largerNodeList.get(ii)) {
                    return smallerNodeList.get(i);
                }
            }
        }
        return null;
    }
    
}