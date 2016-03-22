package trees;

public class TreeNode {

	public TreeNode left;
	public TreeNode right;
	public int val;
	
	public TreeNode(int val) {
		this.left = null;
		this.val = val;
		this.right = null;
	}
	
	public TreeNode(TreeNode left, TreeNode right, int val)
	{
		this.left = left;
		this.right = right;
		this.val = val;
	}
	
	public int getHeight(TreeNode root)
	{
		if(root==null)
			return 0;
		return 1+ Math.max(getHeight(root.left), getHeight(root.right));
	}
}
