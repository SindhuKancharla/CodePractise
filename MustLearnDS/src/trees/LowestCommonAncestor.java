package trees;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

	public static void main(String[] args){
		
		MyTreeNode m = new MyTreeNode(1);
		
		MyTreeNode m1 = new MyTreeNode(-1);
		MyTreeNode m2 = new MyTreeNode(-2);

		MyTreeNode n = new MyTreeNode(3,m1,m2);

		MyTreeNode mn = new MyTreeNode(2,m,n);
		
		MyTreeNode x = new MyTreeNode(10);
		MyTreeNode y = new MyTreeNode(20);
		
		MyTreeNode xy = new MyTreeNode(15,x,y);
		
		MyTreeNode mnxy = new MyTreeNode(7,mn,xy);
		inOrderTraversal(mnxy);
		
		MyTreeNode lca = lca(mnxy,m,mn);
		System.out.println("lca = "+lca.data);
		
		System.out.println("Min depth = "+minDepth(mnxy));

		printAllRootToLeafPaths(mnxy);
	}
	
	static List<Integer> list = new ArrayList<Integer>();
	
	private static void printAllRootToLeafPaths(MyTreeNode root) {
		
		if(root==null)
			return;
		
		if(root.left==null && root.right==null)
		{
			for(int i : list)
			{
				System.out.print(i + " ");
			}
			System.out.println(root.data);
			return;
		}
		list.add(root.data);

		printAllRootToLeafPaths(root.left);
		printAllRootToLeafPaths(root.right);
		list.remove(list.size()-1);
	}

	private static MyTreeNode lca(MyTreeNode root,MyTreeNode mn, MyTreeNode xy) {

		if(root.data==mn.data || root.data == xy.data)
			return root;
		
		if((mn.data < root.data && root.data < xy.data) || (mn.data > root.data && root.data > xy.data)){
			return root;
		}
		if(mn.data < root.data && xy.data < root.data)
			return lca(root.left,mn,xy);
		if(mn.data > root.data && xy.data > root.data)
			return lca(root.right,mn,xy);
		
		return null;
	}

	private static int minDepth(MyTreeNode root)
	{
		if(root==null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		
		if(root.left!=null)
			 return  minDepth(root.left)+1;
		
		if(root.right!=null)
			return  minDepth(root.right)+1; 
		
		return 1+ Math.min(minDepth(root.left),minDepth(root.right));
	}
	
	static void inOrderTraversal(MyTreeNode root){
		
		if(root==null)
			return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
}
