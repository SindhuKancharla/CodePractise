package queues;

import linkedlists.MyLinkedList;

public class QueueLL {

	MyLinkedList qu = new MyLinkedList();
	
	public void enQueue(Object data){
		
		qu.add(data);
	}
	
	public Object deQueue(){
		
		Object d = qu.getHead().getData();
		qu.remove(d);
		return d;
	}
	
	public void displayQ(){
		qu.displayList();
	}
	
	public int size(){
		return qu.size();
	}
	
	public boolean isEmpty(){
		if(qu.getHead()==null)
			return true;
		else
			return false;
	}
}
