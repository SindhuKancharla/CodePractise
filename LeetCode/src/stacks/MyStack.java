package stacks;

import linkedlists.MyLinkedList;

public class MyStack {

	MyLinkedList stack = new MyLinkedList();
	
	int top = -1;
	
	public void push(Object data)
	{
		stack.addInBeginning(data);
		top++;
	}
	
	public Object peek(){
		
		Object data;
		if(stack.head!=null)
			data = stack.head.data;
		else
			data = -1;
		return data;
	}
	
	public Object pop()
	{
		Object data = stack.removeFromBeginning();
		top--;
		return data;
	}
	
	public void print(){
		stack.print(stack.head);
	}
	
	public boolean isEmpty(){
		
		if(top==-1)
			return true;
		else
			return false;
	}
}
