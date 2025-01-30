

class Solution {
    List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        print(root);
        return list;
    }


    	public  void print(TreeNode root){
	    if(root==null)return;
        print(root.left);
	    print(root.right);
         list.add(root.val);
	    
	}
}