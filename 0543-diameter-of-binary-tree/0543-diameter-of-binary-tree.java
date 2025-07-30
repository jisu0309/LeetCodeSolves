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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return diameter(root.left, 0)+diameter(root.right,0);
    }

    int diameter(TreeNode root, int depth){
        if(root==null) return depth;
        
        depth++;
        return Math.max(diameter(root.left,depth), diameter(root.right,depth));
    }
}