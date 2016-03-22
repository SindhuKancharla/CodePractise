package linkedlists;

public class DetectLoopInLinkedList {

	public static void main(String[] args){
		
		MyLinkedList list = new MyLinkedList();
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(4);

		Node cur = findStartOfLoop(list.head);
		System.out.println(cur.data);
	}

	private static Node findStartOfLoop(Node head) {
		
		Node fastptr = head, slowptr = head;
		
		while(fastptr.next!=null)
		{
			fastptr = fastptr.next;
			if(fastptr.next !=null){
				fastptr = fastptr.next;
				slowptr = slowptr.next;
			}
			if(fastptr.data == slowptr.data)
			{
				System.out.println("Loop Detected");
				break;
			}
		}
		slowptr = head;
		while(slowptr!=fastptr){

			slowptr = slowptr.next;
			fastptr = fastptr.next;
		}
		return slowptr;
	}
}
