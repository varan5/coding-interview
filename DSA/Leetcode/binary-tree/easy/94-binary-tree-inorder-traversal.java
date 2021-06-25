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
 
 // Algorithmic Complexities
 // Time:  O(n) - Where 'n' is the number of nodes in the tree
 // Space: O(n) - Since we are using an array to store all the nodes
 
 
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        resultList = inorderTraversalHelper(root, resultList);
        return resultList;
    }
    
    public ArrayList<Integer> inorderTraversalHelper(TreeNode root, ArrayList resultList) {
        if (root == null) {
            return resultList;
        }
        
        inorderTraversalHelper(root.left, resultList);
        resultList.add(root.val);
        inorderTraversalHelper(root.right, resultList);
        
        return resultList;
    }
}
                                  