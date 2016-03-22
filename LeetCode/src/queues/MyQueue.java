package queues;

import linkedlists.MyLinkedList;

public class MyQueue {
	
	MyLinkedList queue = new MyLinkedList();
	
	public void enQueue(Object data)
	{
		queue.add(data);
	}
	
	public Object deQueue()
	{
		return queue.removeFromBeginning();
	}
	
	public boolean isEmpty(){
		
		if(queue.head==null)
			return true;
		else
			return false;
	}
	
	public void print(){
		queue.print(queue.head);
	}
}
