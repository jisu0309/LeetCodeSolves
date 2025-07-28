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
    public boolean isBalanced(TreeNode root) {
        int dpt = depth(root, 1);
        return dpt>0;
    }

    int depth(TreeNode root, int dpt){
        if(root==null) return dpt;

        dpt++;
        int left = depth(root.left, dpt);
        int right = depth(root.right, dpt);

        // System.out.printf("%d-%d) %d, %d\n", root.val, dpt, left, right);
        if(left*right<0 || Math.abs(left-right) > 1) {
            return -1;
        }
        return Math.max(left, right);
    }
}