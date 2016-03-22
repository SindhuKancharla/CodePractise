package trees;

import stacks.MyStack;
import stacks.NewStack;

public class TreeTraversals {

	public static void main(String[] args){
		
		MyTreeNode lr = new MyTreeNode(1);
		
		MyTreeNode gr = new MyTreeNode(3);
		MyTreeNode ll = new MyTreeNode(5);
		
		MyTreeNode lr2 = new MyTreeNode(4,gr,ll);
		
		
		MyTreeNode root = new MyTreeNode(2,lr,lr2);

		preorder(root);
		System.out.println("---Preorder---");

		iterpreorder(root);
		System.out.println("---Iter Preorder---");
		
		inorder(root);
		System.out.println("---Inorder---");
		
		iterInorder(root);
		System.out.println("---Iter Inorder---");
		
		postorder(root);
		System.out.println("---Postorder---");
		
		iterPostorder(root);
		System.out.println("---Iter Postorder---");
		

	}
	
	private static void iterPostorder(MyTreeNode root) {

		NewStack ms = new NewStack();
		
		ms.push(root);
		
		while(!ms.isEmpty()){
			
			if(root.getLeft()!=null)
			{
				root = root.getLeft();
				ms.push(root);
			}
			else{
				root = (MyTreeNode) ms.peek();
				if(root.getRight()!=null)
				{
					root = root.right;
					ms.push(root);
				}
				else{
					root = (MyTreeNode)ms.pop();
					System.out.print(root.getData()+ " ");
				}
			}
		}
	}

	public static void preorder(MyTreeNode root)
	{
		if(root!=null){
			preorder(root.left);
			preorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public static void iterpreorder(MyTreeNode root){
		
		NewStack st = new NewStack();
		st.push(root);
		
		while(!st.isEmpty()){
			
			MyTreeNode node = (MyTreeNode) st.pop();

			System.out.print(node.data + " ");

			if(node.getLeft() != null){
				st.push(node.getLeft());
			}
			if(node.getRight()!= null){
				st.push(node.getRight());
			}
		}
	}
	
	public static void inorder(MyTreeNode root)
	{
		if(root!=null){
			inorder(root.left);
			System.out.print(root.data +" ");
			inorder(root.right);
		}
	}
	
	public static void iterInorder(MyTreeNode root)
	{
		NewStack ms = new NewStack();
		
		ms.push(root);
		
		while(!ms.isEmpty()){
			
			if(root.getLeft()!=null)
			{
				root = root.getLeft();
				ms.push(root);
			}
			else{
				root = (MyTreeNode)ms.pop();
				System.out.print(root.getData()+ " ");
				if(root.getRight()!=null)
				{
					root = root.right;
					ms.push(root);
				}
			}
		}
				
	}
	
	public static void postorder(MyTreeNode root)
	{
		if(root !=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
}
