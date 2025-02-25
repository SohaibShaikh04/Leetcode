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
    List<Double> ans;
    public List<Double> averageOfLevels(TreeNode root) {
        ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
         double averageLevel = 0;
        
        for(int i=0;i<levelsize;i++){
            TreeNode currentNode = queue.poll();
            averageLevel+=currentNode.val;
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }
             if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }
        }
        averageLevel/=levelsize;
        ans.add(averageLevel);
    }
      return ans;  
    }
}