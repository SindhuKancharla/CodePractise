package trees;

import linkedlists.MyLinkedList;
import linkedlists.MyNode;

public class ConvertSortedListToBST {

	public static void main(String[] args) {

		
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int[] arr = new int[]{1,2,3,4,5};
		
		MyTreeNode root = convert(list.getHead(),null);
		
		BinaryTree.inorder(root);
		System.out.println();
		convertFromArray(arr, 0, arr.length-1);
		BinaryTree.inorder(root);

	}
	
	private static MyTreeNode convertFromArray(int[] arr,int start, int end)
	{
		if(start>end)
			return null;
		
		int mid = start + (end-start)/2;
		
		MyTreeNode root = new MyTreeNode(arr[mid]);
		
		root.left = convertFromArray(arr, start, mid-1);
		
		root.right = convertFromArray(arr, mid+1, end);
		
		return root;
		
	}

	private static MyTreeNode convert(MyNode start, MyNode end) {

		if(start==end)
			return null;
		
		MyNode fastptr = start;
		MyNode slowptr = start;
		
		while(fastptr!=end)
		{
			fastptr = fastptr.getNext();
			if(fastptr!=end)
			{
				fastptr = fastptr.getNext();
				slowptr = slowptr.getNext();
			}
		}
		System.out.println(slowptr.getData());
		MyTreeNode root = new MyTreeNode(slowptr.getData());
		root.left = convert(start,slowptr);
		root.right = convert(slowptr.getNext(),end);
		
		return root;
	}

	
}
