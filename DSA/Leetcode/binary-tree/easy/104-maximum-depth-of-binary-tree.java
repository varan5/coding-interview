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
        if (root == null)
            return 0;
        
        int leftTreeMaxDepth = maxDepth(root.left);
        int rightTreeMaxDepth = maxDepth(root.right);
        int treeMaxDepth = Math.max(leftTreeMaxDepth, rightTreeMaxDepth) + 1;
        return treeMaxDepth;
    }
}


