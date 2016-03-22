package stacks;

import linkedlists.MyLinkedList;
import linkedlists.Node;

public class MyStack {

	MyLinkedList stack;
	int top = -1;
	
	
	public MyStack() {
		stack = new MyLinkedList();
	}
	
	public Node push(Object data){
		
		Node head = stack.addInBeginning(data);
		top++;
		MinMaxStack.pushMinStack( data);
		return head;
	}
	
	public Object peek(){
		
		Object data =  this.stack.head.getData();
		return data;
	}
	
	public Object pop(){
		
		Node head = stack.head;
		
		Object data =  head.getData();
				
		stack.head = head.getNext();
		MinMaxStack.popMinStack(data);
		top--;
		return data;
	}
	
	
	public void display(){
		stack.print(stack.head);
	}

	public boolean isEmpty(){
		if(top==-1)
			return true;
		else
			return false;
	}
}
