package queues;

import java.util.LinkedList;


public class MyQueue {

	LinkedList<Object> list = new LinkedList<Object>();
	
	public void enQueue(Object data)
	{
		list.addLast(data);
	}
	
	public Object deQueue(){
		Object first = list.get(0);
		list.remove();
		return first;
	}
	
	public void printQueue(){
		System.out.println(list);
	}
	
	public boolean isEmpty(){
	
		if(list.size()==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		
		MyQueue q = new MyQueue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(9);
		q.enQueue(20);
		q.printQueue();
		q.deQueue();
		q.printQueue();
	}
}
