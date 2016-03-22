package linkedlists;

public class IntersectionOfLinkedLists {

	public static void main(String[] args){
		
		MyLinkedList list = new MyLinkedList();
		list.add(0);
		list.add(-1);
		list.add(-3);
		list.add(9);

		list.add(2);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(9);

		MyLinkedList list1 = new MyLinkedList();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(9);

		Node cur = findIntersection(list.head,list1.head);
		System.out.println(cur.data);
	
	}

	private static Node findIntersection(Node head, Node head2) {
		
		int l1 = findSize(head);
		int l2 = findSize(head2);
		
		int diff = 0;
		if(l1>l2){
			
			diff = l1-l2;
			while(diff>0){
				head = head.next;
				diff--;
			}
		}
		else{
			diff = l2-l1;
			while(diff>0){
				head2 = head2.next;
				diff--;
			}
		}
		
		while(head !=null)
		{
			if(head.data == head2.data)
			{
				return head;
			}
			head = head.next;
			head2 = head2.next;
		}
		return null;

	}

	private static int findSize(Node head){
		
		Node cur = head;
		int count = 0;
		
		while(cur!=null)
		{
			cur = cur.next;
			count++;
		}
		
		return count;
	}
}
