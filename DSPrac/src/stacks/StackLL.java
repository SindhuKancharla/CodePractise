package stacks;

import linkedlists.MyLinkedList;

public class StackLL {

	MyLinkedList stack = new MyLinkedList();
	int top = -1;
	
	public StackLL() {
		// TODO Auto-generated constructor stub
	}

	public void push(Object data){
		stack.addInBeginning(data);
		top++;
	}
	
	public Object pop(){
		Object data = stack.getHead().getData();
		top--;
		stack.remove(data);
		return data;
	}
	
	public void display(){
		stack.displayList();
	}

	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
}
