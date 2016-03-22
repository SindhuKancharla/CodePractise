package queues;

public class MyQueueTest {

	public static void main(String[] args) {

		MyQueue q =new MyQueue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		
		q.print();
		
		q.deQueue();
		q.print();
	}

}
