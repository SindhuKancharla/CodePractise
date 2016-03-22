package trees;

public class BSTNode {

	Object data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(Object data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BSTNode(Object data, BSTNode left, BSTNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public BSTNode add(BSTNode root,int value){
		
		
		if(root==null){
			root = new BSTNode(value);
			return root;
		}
		if((int)root.data>value)
		{
			root.left = add(root.left,value);
		}
		else if((int)root.data < value)
		{
			root.right = add(root.right,value);
		}
		
		return root;
		
	}
	
	public BSTNode findMin(BSTNode root){
		
		if(root==null)
			return null;
		else if(root.left==null)
			return root;
		else
			return findMin(root.left);
		
	}
	
	public void inorderTraversal(BSTNode root){
	
		if(root==null)
			return;
		
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}
	
	public BSTNode findMax(BSTNode root){
		
		if(root==null)
			return null;
		else if(root.right==null)
			return root;
		else
			return findMax(root.right);
		
	}
	
	public boolean findNode(BSTNode root, BSTNode node){
		
		if(root==null)
			return false;
		
		if(root.data==node.data)
			return true;
		else if((int)root.data < (int)node.data)
			return findNode(root.right,node);
		else if((int)root.data > (int)node.data)
			return findNode(root.left, node);
		
		return false;
	}
	
	public BSTNode LCA(BSTNode root, BSTNode a, BSTNode b){
		
		if(root==null)
			return null;
		if((int)root.data > (int)a.data && (int)root.data < (int)b.data || ((int)root.data < (int)a.data && (int)root.data > (int)b.data))
			return root;
		
		if((int)root.data <(int) a.data && (int)root.data <(int)b.data)
			return LCA(root.right,a,b);
		else if((int)root.data > (int)a.data && (int)root.data>(int)b.data)
			return LCA(root.left,a,b);
		else
			return null;
	}
	
	public boolean isBST(BSTNode root){
		
		if(root==null)
			return true;
		
		if(root.left!=null && (int)findMax(root.left).data < (int)root.data)
			isBST(root.left);
		else
			return false;
		
		if(root.right!=null && (int)findMin(root.right).data > (int)root.data)
			isBST(root.right);
		else
			return false;
		
		return true;
	}
}
