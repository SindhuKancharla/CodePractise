package trees;

import java.util.ArrayList;
import java.util.List;

public class SinTreeNode {

	public SinTreeNode left;
	public SinTreeNode right;
	
	public int data;
	
	public SinTreeNode(int data){
		
		this.left = null;
		this.right = null;
		this.data = data;
	}
	
	public SinTreeNode(int data,SinTreeNode left,SinTreeNode right){
		
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	List<Integer> list = new ArrayList<>();
	
	public void printAllPaths(SinTreeNode root){
	
		if(root.left==null || root.right==null){
			list.add(root.data);
			for(int i : list){
				System.out.print(i+ " ");
			}
			System.out.println();
			return;
		}
		else{
			list.add(root.data);
		}
		printAllPaths(root.left);
		list.remove(list.size()-1);
		printAllPaths(root.right);
		list.remove(list.size()-1);

	}
	
	public void inorderTraversal(SinTreeNode root){
	
		if(root==null)
			return;
		
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	
	int min = 32767;
	
	public int findMin(SinTreeNode root){
		
		if(root==null)
			return min;
	
		int data = root.data;
		if(data < min)
			min = data;
		
		findMin(root.left);
		findMin(root.right);
		
		return min;
	}
	
	int max = -32767;

	public int findMax(SinTreeNode root){
		
		if(root==null)
			return max;
	
		int data = root.data;
		if(data>max)
			max = data;
		
		findMax(root.left);
		findMax(root.right);
		
		return max;
	}
	

	public int inorderSuccessor(SinTreeNode node, SinTreeNode root){
		
		if(node.right !=null){
			return findMin(node.right);
		}
		else
		{
			return findAncestor(node,root).data;
		}
	}
	
	private SinTreeNode findAncestor(SinTreeNode node, SinTreeNode root) {
		
		SinTreeNode left,right;
	
		if(root.left==null||root.right==null)
			return null;
		
		if(root.left.data==node.data || root.right.data == node.data){
			return root;
		}
		
		left = findAncestor(node, root.left);
		right = findAncestor(node, root.right);

		if(left !=null && right !=null)
			return root;
		
		return (left !=null)?left:right;
	}
	
	public boolean hasSum(SinTreeNode root,int sum){
		
		if(root==null && sum==0)
			return true;
		if(root==null)
			return false;
		
		return hasSum(root.left, sum-root.data) || hasSum(root.right, sum-root.data);
	}

	public boolean ifBST(SinTreeNode root){
		
		if(root==null)
			return true;
		
		if(root.left!=null && (int)findMax(root.left) < (int)root.data)
			ifBST(root.left);
		else
			return false;
		
		if(root.right!=null && (int)findMin(root.right) > (int)root.data)
			ifBST(root.right);
		else
			return false;
		
		return true;
	}
	public static void main(String[] args){
		
		SinTreeNode l1 = new SinTreeNode(2);
		SinTreeNode r1 = new SinTreeNode(4);
		
		SinTreeNode l2 = new SinTreeNode(3,l1,r1);
		
		SinTreeNode lr1 = new SinTreeNode(6);
		SinTreeNode lr2 = new SinTreeNode(8);
		
		SinTreeNode cr2 = new SinTreeNode(7,lr1,lr2);
		SinTreeNode root = new SinTreeNode(5,l2,cr2);
		
		root.printAllPaths(root);
		System.out.println(root.ifBST(root));

		root.inorderTraversal(root);
		System.out.println("inorder succ = "+root.inorderSuccessor(l1,root));
		System.out.println(" min = "+root.findMin(root));

		System.out.println(root.findAncestor(r1, root).data);
	}
}
