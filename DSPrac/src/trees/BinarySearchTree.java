package trees;

public class BinarySearchTree {

	public static void main(String[] args){
		
		MyTreeNode n = new MyTreeNode(-1);
		MyTreeNode z = new MyTreeNode(1);
		MyTreeNode lr = new MyTreeNode(0,n,z);
		
		MyTreeNode gr = new MyTreeNode(3);
		MyTreeNode ll = new MyTreeNode(5);
		
		MyTreeNode lr2 = new MyTreeNode(4,gr,ll);
		
		
		MyTreeNode root = new MyTreeNode(2,lr,lr2);
		
		BinaryTree.inorder(root);
		
		System.out.println(" \n\nIs BST ? "+checkBST(root));
		
		System.out.println(" LCA of BST "+findLCA(root,5,0).data);
		
		System.out.print("kth largest element is -- "); kthLargestElement(root,5);

	}

	static int count = 0;
	
	public static void kthLargestElement(MyTreeNode root,int k)
	{
		if(root!=null)
		{
			kthLargestElement(root.right,k);
			
			count++;
			
			
			int val = (int)root.data;
			
			if(count==k)
			{
				System.out.println(val);
				return;
			}
			kthLargestElement(root.left,k);
		}
		
	}
	
	private static int findMin(MyTreeNode root){
		
		
		while(root.left!=null)
		{
			root= root.left;
		}
		return (int)root.data;
	}
	
	private static int findMax(MyTreeNode root){
		
		while(root.right!=null){
			root = root.right;
		}
		return (int)root.data;
	}
	
	private static boolean checkBST(MyTreeNode root) {

		if(root==null)
			return true;
		
		if(root.left !=null && (int)root.data < findMax(root.left))
			return false;
		
		if(root.right!=null && (int)root.data > findMin(root.right))
			return false;
		
		return checkBST(root.left) && checkBST(root.right);
		
	}
	
	public static MyTreeNode findLCA(MyTreeNode root,int a,int b){
		
		if(root==null)
			return null;
		
		int d = (int) root.data;
		if(d==a || d==b)
			return root;
		
		if( (d < a && d > b)  || ( d>a && d<b))
			return root;
		
		else if(d<a && d<b)
			return findLCA(root.right, a, b);
		
		else
			return findLCA(root.left, a, b);
		
	}
}
