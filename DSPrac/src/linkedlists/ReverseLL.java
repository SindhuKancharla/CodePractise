package linkedlists;

public class ReverseLL {

	public static void main(String[] args) {

		MyLinkedList l1 = new MyLinkedList();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		
//		MyNode cur = reverse(l1);
//		
//		print(cur);
//		
		
		MyNode cur2 = recursiveReverse(l1.head);
		print(cur2);
	}

	private static void print(MyNode cur){
		
		while(cur!=null){
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
		
	}
	private static MyNode recursiveReverse(MyNode head) {
		
		if(head.next==null)
			return head;
		
		MyNode rem = recursiveReverse(head.next);
		head.next.next = head;
		head.next = null;
		
		return rem;
	}

	private static MyNode reverse(MyLinkedList l1) {

		MyNode prev=null,head,nxt=null;
		
		head = l1.head;
		
		while(head!=null){
			nxt = head.next;
			head.next = prev;
			
			prev = head;
			head = nxt;
		}
		return prev;
	}
	
	

}
