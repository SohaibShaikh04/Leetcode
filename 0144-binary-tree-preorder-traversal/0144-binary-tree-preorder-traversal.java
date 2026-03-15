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
    ArrayList<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        print(root);
        return result;
    }

    public void print(TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.val);
        print(root.left);
        print(root.right);
    }
}