package stacks;

import linkedlists.MyLinkedList;

public class NewStack {

	MyLinkedList stack = new MyLinkedList();
	int top =-1;
	
	public NewStack() {
		// TODO Auto-generated constructor stub
	}
	
	public void push(Object data)
	{
		stack.addInBeginning(data);
		top++;
	}
	
	public Object pop()
	{
		top--;
		Object v = stack.head.getData();
		
		stack.head = stack.head.getNext();
		
		return v;
	}
	
	public Object peek()
	{
		//top--;
		Object v = stack.head.getData();
		
		//stack.head = stack.head.getNext();
		
		return v;
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
}
