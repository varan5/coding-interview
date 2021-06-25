
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
 // Space: O(n) - Since we are storing each node in the array named 'result'
 
 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList = preorderTraversalHelper(root, resultList);
        return resultList;
    }
    
    public ArrayList<Integer> preorderTraversalHelper(TreeNode root, ArrayList resultList) {
        if (root == null) {
            return resultList;
        }

        resultList.add(root.val);
        preorderTraversalHelper(root.left, resultList);
        preorderTraversalHelper(root.right, resultList);
        
        return resultList;
    }
}
