class Solution {
    List<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        print(root);
        return list;
    }


    	public  void print(TreeNode root){
	    if(root==null)return;
        print(root.left);
	    list.add(root.val);
	    print(root.right);
	    
	}
}