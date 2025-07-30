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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int dpt = diameter(root);
        return max;
    }

    int diameter(TreeNode root){
        if(root==null) return 0-1;
        
        int left = diameter(root.left)+1;
        int right = diameter(root.right)+1;

        max = Math.max(max, left+right);
        return Math.max(left, right);
    }
}