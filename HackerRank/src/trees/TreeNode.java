package trees;

import java.util.HashMap;
import java.util.Map.Entry;

import queues.MyQueue;

public class TreeNode {
	
	Object data;
	TreeNode left;
	TreeNode right;

	public TreeNode(Object data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(Object data) {

		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public static boolean checkMirrors(TreeNode t1,TreeNode t2){
		
		if(t1==null && t2==null)
			return true;
		if(t1==null && t2!=null)
			return false;
		if(t1.data != t2.data)
			return false;
		else return checkMirrors(t1.left, t2.right) && checkMirrors(t1.right, t2.left);
	}
	
	public static void preorderTraversal(TreeNode tree){
		if(tree==null)
			return;
		System.out.println(tree.data);
		preorderTraversal(tree.left);
		preorderTraversal(tree.right);
	}
	
	public static void postorderTraversal(TreeNode tree){
		
		if(tree==null)
			return;
		postorderTraversal(tree.left);
		postorderTraversal(tree.right);
		System.out.println(tree.data);
	}
	
	public static void inorderTransversal(TreeNode tree){
		
		if(tree==null)
			return;
		
		inorderTransversal(tree.left);
		System.out.println(tree.data);
		inorderTransversal(tree.right);
	}
	
	public void levelorderTraversal(TreeNode tree)
	{
		MyQueue queue = new MyQueue();
		queue.enQueue(tree);
		
		while(!queue.isEmpty()){
			
			TreeNode tmp = (TreeNode) queue.deQueue();
			System.out.println(tmp.data);
			if(tmp.left !=null)
				queue.enQueue(tmp.left);
			if(tmp.right !=null)
				queue.enQueue(tmp.right);
		}
	}
	
	public int printLeaves(TreeNode tree)
	{
		MyQueue queue = new MyQueue();
		int count = 0;
		queue.enQueue(tree);
		
		while(!queue.isEmpty()){
			
			TreeNode tmp = (TreeNode) queue.deQueue();
			if(tmp.left !=null)
				queue.enQueue(tmp.left);
			
			if(tmp.right !=null)
				queue.enQueue(tmp.right);
			
			if(tmp.left==null && tmp.right==null)
			{
				System.out.println(tmp.data);
				count++;
			}
		}
		return count;
	}
	
	public int findTotal(TreeNode tree) {

		if(tree == null)
			return 0;
		
		int data = (int) tree.data;
		//System.out.println(data);
		return data + findTotal(tree.left) + findTotal(tree.right);
	}
	int max = -32767;

	public int findMax(TreeNode tree)
	{
		if(tree==null)
			return max;
		int data = (int) tree.data;
		if(data > max)
			max = data;
		findMax(tree.left);
		findMax(tree.right);
		return max;
	}
	
	public boolean findNode(TreeNode tree,Object data){
		
		if(tree==null)
			return false;
		if(tree.data==data)
			return true;
	
		return findNode(tree.left, data) || findNode(tree.right, data);
	}
	
	public TreeNode LeastCommonAncestor(TreeNode root,TreeNode t1,TreeNode t2){
		
		TreeNode left,right;
		if(root==null)
			return null;

		if(root==t1 || root==t2)
			return root;
		
	
		left = LeastCommonAncestor(root.left, t1, t2);
		right = LeastCommonAncestor(root.right, t1, t2);
		
		if(left!=null && right !=null)
			return root;
		
		return (left !=null)?left:right;
	}
	
	public boolean printAllAncestors(TreeNode root, TreeNode node){
		
		if(root==null)
			return false;
		
		if(root==node)
		{
			return true;
		}
		if(printAllAncestors(root.left, node) || printAllAncestors(root.right, node)){
			System.out.println(root.data);
			return true;
		}
		return false;
	}
	HashMap<Integer, Integer> map = new HashMap<>();

	public void verticalSum(TreeNode root,int key){
		

		if(root==null)
			return;
		
		System.out.println("key = "+key + " val = "+root.data);
		
		verticalSum(root.left,key-1);
		
		if(map.keySet().contains(key)){
			int tmp = map.get(key);
			tmp += (int)root.data;
			map.put(key, tmp);
		}
		else
			map.put(key, (Integer) root.data);
		
		verticalSum(root.right,key+1);
		
		for(Entry<Integer,Integer> en : map.entrySet())
		{
			System.out.println(en.getKey() + " : "+en.getValue());
		}
		System.out.println("-----------");
	}
}