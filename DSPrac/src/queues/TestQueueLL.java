package queues;

public class TestQueueLL {

	public static void main(String[] args){
		
		QueueLL q = new QueueLL();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(4);
		
		q.displayQ();
		
		q.deQueue();
		q.displayQ();
	}
}
