package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import queues.MyQueue;

public class MaxDepthOfBinaryTree {

	public static void main(String[] args) {

		TreeNode flr = new TreeNode(7);
		TreeNode fl = new TreeNode(6);
		TreeNode gl = new TreeNode(4,fl,flr);
		TreeNode glr = new TreeNode(5);
		TreeNode left = new TreeNode(2,gl,glr);
		TreeNode right = new TreeNode(3);
		TreeNode tree = new TreeNode(1,left,right);
		
		
		TreeNode two = new TreeNode(2);
		TreeNode tst = new TreeNode(1,two,null);
		levelOrderTraversal(tree);
		System.out.println(isBalanced(tree));
		System.out.println(maxDepth(tree));
		System.out.println(minDepth(tree));
	}

	private static int minDepth(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		else{
			
			if(root.right==null)
			{
				return 1+ minDepth(root.left);
			}
			
			else if(root.left==null)
			{
				return 1+minDepth(root.right);
			}
			else{
				return Math.min(minDepth(root.left), minDepth(root.right))+1;
			}
		}
		
	}
	
	private static int maxDepth(TreeNode root) {

		if(root==null)
			return 0;
		else{
			int left = maxDepth(root.left);
			int right =  maxDepth(root.right);
			
			return 1+Math.max(left, right);
		}
	}
	private static int height(TreeNode root)
	{
		if(root==null)
			return 0;
		else
		{
			int left = height(root.left);
			int right = height(root.right);
			
			return 1+Math.max(left, right);
		}
	}
	private static boolean isBalanced(TreeNode tree)
	{
		if(tree==null)
		{
			return true;
		}
		int hl = height(tree.left);
		int hr = height(tree.right);

		if(Math.abs(hl-hr)>1)
			return false;
		else{
			return isBalanced(tree.left) && isBalanced(tree.right);
		}
	}
	
	public static void levelOrderTraversal(TreeNode root)
	{
		
		List<List<Integer>> list = new ArrayList<>();

		MyQueue qu = new MyQueue();
		qu.enQueue(root);
		List<Integer> l = new ArrayList<>();
		l.add((int)root.data);
		list.add(l);

		while(!qu.isEmpty())
		{
			Map<Integer,List<Integer>> map = new HashMap<>();
			
			l = new ArrayList<>();
			TreeNode tmp = (TreeNode) qu.deQueue();
			if(tmp.left!=null){
				qu.enQueue(tmp.left);

				if(map.containsKey(tmp.data)){
					map.get(tmp.data).add((int)tmp.left.data);
				}
				else{
					l.add((int)tmp.left.data);
					map.put((int)tmp.data, l);
				}
			}
			if(tmp.right!=null){
				qu.enQueue(tmp.right);
				
				if(map.containsKey(tmp.data)){
					map.get(tmp.data).add((int)tmp.left.data);
				}
				else{
					l.add((int)tmp.left.data);
					map.put((int)tmp.data, l);
				}
				//l.add((int)tmp.right.data);
			}
			System.out.println("size = "+l.size());
			if(l.size()>0)
				list.add(l);
		}
		for(List<Integer> li : list)
		{
			for(int x : li)
			{
				System.out.print(x + " ");
			}
			System.out.println();

		}
	}

}
