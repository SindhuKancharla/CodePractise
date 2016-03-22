package stacks.queues;

import java.util.LinkedList;

import linkedlists.SinLinkedList;
import linkedlists.SinNode;

public class SinQueue {

	SinLinkedList queue;

	public SinQueue() {
		this.queue = new SinLinkedList();
	}

	public int size(){
		int count=0;
		SinNode cur = queue.head;
		while(cur!=null){
			cur = cur.getNext();
			count++;
		}
		return count;
	}
	public boolean isEmpty(){
	
		if(queue.head==null){
			return true;
		}
		else
			return false;
	}
	LinkedList<Integer> list = new LinkedList<>();
	
	public void enQueue(int data) {
		
	
		SinNode head = queue.head;
		if (head == null) {
			queue.insertNth(0, new SinNode(data));
		} else {
			SinNode cur = head;
			while (cur.getNext() != null) {
				cur = cur.getNext();
			}
			cur.setNext(new SinNode(data));
		}

		queue.display();
	}

	public int deQueue() throws NullPointerException {

		int val = queue.head.getData();

		queue.head = queue.head.getNext();
		// queue.display();
		//System.out.println("Dequeued : " + val);
		return val;
	}

	public static void main(String[] args) {

		SinQueue sq = new SinQueue();
		try {
			sq.enQueue(1);
			sq.enQueue(2);
			sq.enQueue(3);

			sq.deQueue();
			sq.deQueue();
			sq.enQueue(1);
			sq.deQueue();
			sq.deQueue();
			sq.deQueue();
		} catch (NullPointerException e) {
			System.out.println("You tried dequeing an empty queue !!");
		}
	}
}
