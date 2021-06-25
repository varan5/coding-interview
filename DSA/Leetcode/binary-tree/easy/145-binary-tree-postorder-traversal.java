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
 // Space: O(n) - Since we are creating an array to store all the nodes
 
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        resultList = postorderTraversalHelper(root, resultList);
        return resultList;
    }
    
    public ArrayList<Integer> postorderTraversalHelper(TreeNode root, ArrayList resultList) {
        if (root == null) {
            return resultList;
        }
        
        postorderTraversalHelper(root.left, resultList);
        postorderTraversalHelper(root.right, resultList);
        resultList.add(root.val);
        
        return resultList;
    }  
}
