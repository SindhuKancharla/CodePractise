package queues;

import java.util.LinkedList;

public class MyQueueLL {

	LinkedList<Object> queue = new LinkedList<Object>();
	
	public void enQueue(Object data)
	{
		queue.add(data);
	}
	
	public Object deQueue()
	{
		return queue.removeFirst();
	}
	
	public boolean isEmpty(){
		
		if(queue.isEmpty())
			return true;
		else
			return false;
	}
	
	
}
