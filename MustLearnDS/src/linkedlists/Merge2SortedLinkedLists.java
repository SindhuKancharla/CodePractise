package linkedlists;


public class Merge2SortedLinkedLists {

	public static void main(String[] args){
		
		MyLinkedList list = new MyLinkedList();
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		
		MyLinkedList list1 = new MyLinkedList();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(9);

		Node cur = merge(list.head,list1.head);
		list.print(cur);                                                                                                                                                                                                                                 
	}

	private static Node merge(Node head, Node head2) {

		Node chd = null;
		
		int x = (int) head.data;
		int y = (int) head2.data;
		
		if(x < y)
		{
			chd = head;
			head = head.next;
		}
		else{
			chd = head2;
			head2 = head2.next;
		}
		
		Node cur = chd;

		while(head!=null && head2!=null){
			
			x = (int) head.data;
			y = (int) head2.data;
			
			if(x < y){
				//Node tmp = head.next;
				cur.next = head;
				head = head.next;
			}
			else{
				//Node tmp = head2.next;
				cur.next = head2;
				head2 = head2.next;
			}
			cur = cur.next;
		}
		
		while(head!=null){
			//Node tmp = head.next;
			cur.next = head;
			head = head.next;
			cur = cur.next;
		}
		while(head2!=null){
			//Node tmp = head2.next;
			cur.next = head2;
			head2 = head2.next;
			cur = cur.next;
		}
		return chd;
	}
}
