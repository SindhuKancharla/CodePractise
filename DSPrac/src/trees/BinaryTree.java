package trees;

import java.util.ArrayList;
import java.util.List;

import queues.QueueLL;
import stacks.StackLL;

public class BinaryTree {

	static int[] arr;
	public static void main(String[] args){
		
		MyTreeNode n = new MyTreeNode(-1);
		MyTreeNode z = new MyTreeNode(1);
		MyTreeNode lr = new MyTreeNode(0,n,z);
		
		MyTreeNode glr = new MyTreeNode(6);
		
		MyTreeNode gr = new MyTreeNode(3,glr,null);
		MyTreeNode ll = new MyTreeNode(5);
		
		MyTreeNode lr2 = new MyTreeNode(4,gr,ll);
		
		
		MyTreeNode root = new MyTreeNode(2,lr,lr2);

		preorder(root);
		System.out.println("---Preorder---");

		iterpreorder(root);
		System.out.println("---Iter Preorder---");
		
		inorder(root);
		System.out.println("---Inorder---");
		
		iterinorder(root);
		System.out.println("---Iter Inorder");
		
		postorder(root);
		System.out.println("---Postorder---");

		levelorder(root);
		System.out.println("---LevelOrder---");
		
		levelorderReverse(root);
		System.out.println("---LevelOrder Reverse---");
		
		System.out.println("Maximum val = "+findMaximum(root));
		
		System.out.println(find(root,6) + " : 6 val present in tree");
		
		System.out.println("Size of the tree = "+size(root));
		System.out.println("Height of the tree = " + height(root));
		System.out.println("Number of leaves = "+numOFLeaves(root));
		
		printPathToLeaves(root);
		
		System.out.println("\n\n -- Ancestors -- \n");
		printAncestors(root, 2);
		
		System.out.println("Lowest Common Ancestor " + lca(root,4,-1).data);
		
		System.out.println("Left view ");leftView(root,1);
		
		System.out.println("Tree has this sum in any of its paths "+ hasSumInAnyPath(root, 3) );
		
		arr = new int[size(root)];
		 kthLargestElement(root,4);
		 
		 for(int i : arr)
			 System.out.print(i+" ");
		 
		 System.out.println();
		 System.out.print("kth largest element is -- ");
	}
	
	static int index = 0;
	
	public static void kthLargestElement(MyTreeNode root,int k)
	{
		if(root!=null)
		{
			arr[index++] = (int)root.data;
			kthLargestElement(root.left, k);
			kthLargestElement(root.right, k);
		}       
		
	}
	
	public static void preorder(MyTreeNode root)
	{
		if(root!=null){
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public static void iterpreorder(MyTreeNode root){
		
		StackLL st = new StackLL();
		st.push(root);
		
		while(!st.isEmpty()){
			
			MyTreeNode node = (MyTreeNode) st.pop();

			System.out.print(node.data + " ");
			if(node.getRight()!= null){
				st.push(node.getRight());
			}
			if(node.getLeft() != null){
				st.push(node.getLeft());
			}
			
		}
	}
	
	public static void iterinorder(MyTreeNode root){
	
		List<Object> list = new ArrayList<>();
		StackLL st = new StackLL();
		//st.push(root);

		boolean check = false;
		MyTreeNode cur = root;
		while(!check)
		{
			if(cur !=null){
				st.push(cur);
				cur = cur.left;
			}
			else{
				if(!st.isEmpty()){
					cur  = (MyTreeNode) st.pop();
					list.add(cur.getData());
					cur = cur.right;
				}
				else
					check = true;
			}
		}
		
		for(Object i  : list)
			System.out.print(i + " ");
	}
	
	public static void inorder(MyTreeNode root)
	{
		if(root!=null){
			inorder(root.left);
			System.out.print(root.data +" ");
			inorder(root.right);
		}
	}
	
	public static void postorder(MyTreeNode root){
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+ " ");
		}
	}
	
	public static void levelorder(MyTreeNode root){
		
		QueueLL q = new QueueLL();
		q.enQueue(root);
		
		while(!q.isEmpty()){
			MyTreeNode tmp = (MyTreeNode) q.deQueue();
			System.out.print(tmp.data + " ");
			if(tmp.left!=null)
				q.enQueue(tmp.left);
			
			if(tmp.right!=null)
				q.enQueue(tmp.right);
		}
	}
	
	public static void levelorderReverse(MyTreeNode root){
		
		StackLL s = new StackLL();
		QueueLL q = new QueueLL();
		q.enQueue(root);
		
		while(!q.isEmpty()){
			
			MyTreeNode tmp = (MyTreeNode) q.deQueue();

			s.push(tmp.data);
			if(tmp.right!=null)
				q.enQueue(tmp.right);
			
			if(tmp.left!=null)
				q.enQueue(tmp.left);			
		}
		s.display();
	}
	
	public static int findMaximum(MyTreeNode root){
		
		int max = Integer.MIN_VALUE;
		
		if(root !=null){
			int left = findMaximum(root.left);
			int right = findMaximum(root.right);
			
			if(left > right)
				max = left;
			else max = right;
			
			if((int)root.data > max)
				max = (int)root.data;
		}
		return max;
	}
	
	public static boolean find(MyTreeNode root,Object val){
		
		/*if(root==null)
			return false;
		if(root.data==val)
			return true;
		else
			return find(root.left,val)||find(root.right,val);*/
		
		
		if(root !=null){
			
			if(root.data==val)
				return true;
			
			if(find(root.left,val)) return true;
			
			
			if(find(root.right,val)) return true;
		
		}
		
		return false;
	}
	
	public static int size(MyTreeNode root){
		
		if(root==null)
			return 0;
		
		return 1 + size(root.left) + size(root.right);
	}
	
	public static int height(MyTreeNode root){
		
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left), height(root.right));
	}
	
	public static int numOFLeaves(MyTreeNode root){
			
		if(root==null)
			return 0;
		if(root.left ==null && root.right==null){
			//System.out.print(root.data + " ");
			return 1;
		}
		return numOFLeaves(root.left) + numOFLeaves(root.right);
	}
	
	static List<Object> path = new ArrayList<>();

	public static void printPathToLeaves(MyTreeNode root){
		
		
		if(root!=null)
		{
			if(root.left==null && root.right==null){
				for(Object i : path)
					System.out.print(i + " ");
			
				System.out.print(root.data + " \n");
				return;
			}
			else{
				path.add(root.data);
				if(root.left!=null){
					printPathToLeaves(root.left);
				}
				if(root.right!=null)
				{
					printPathToLeaves(root.right);
				}
				
				path.remove(path.size()-1);
			}
		}
	}
	
	public static void printAncestors(MyTreeNode root, Object node){
		
		if(root !=null){
			if(root.data== node){
				for(Object i : path){
					System.out.print(i + " ");
				}
				System.out.print(root.data + "\n");
			}
			else{
				path.add(root.data);
				if(root.left!=null){
					printAncestors(root.left, node);
				}
				if(root.right!=null){
					printAncestors(root.right, node);
				}
				path.remove(path.size()-1);
			}
		}
	}
	
	public static MyTreeNode lca(MyTreeNode root,Object a,Object b){
		
		if(root==null)
			return null;
		
		if(root.data==a || root.data==b){
			return root;
		}
		
		MyTreeNode left = lca(root.left,a,b);
		
		MyTreeNode right = lca(root.right,a,b);
		
		if(left!=null && right !=null)
			return root;
		
		return left!=null? left : right;
	}
	
	static int max_level = 0;
	public static void leftView(MyTreeNode root,int level){
		
		if(root==null)
			return;
		if(level>max_level)
			System.out.println(root.data);
		
		if(max_level < level)
			max_level=level;
		
		leftView(root.left, level+1);
		leftView(root.right, level+1);		
		
	}
	
	public static boolean hasSumInAnyPath(MyTreeNode root,int sum)
	{
		if(root==null)
			return false;
		
		if((int)root.data==sum && root.left==null && root.right==null)
			return true;
		
		return hasSumInAnyPath(root.left, sum-(int)root.data) || hasSumInAnyPath(root.right, sum-(int)root.data);
	}
}
