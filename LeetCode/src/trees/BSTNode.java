package trees;

public class BSTNode {

	public BSTNode left;
	public BSTNode right;
	public int val;
	
	public BSTNode(int val) {
		this.left = null;
		this.val = val;
		this.right = null;
	}
	
	public BSTNode(BSTNode left, BSTNode right, int val)
	{
		this.left = left;
		this.right = right;
		this.val = val;
	}
	
}
