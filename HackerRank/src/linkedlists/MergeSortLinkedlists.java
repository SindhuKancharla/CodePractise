package linkedlists;

public class MergeSortLinkedlists {

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(6);
		ListNode n3 = new ListNode(4);
 
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(7);
		ListNode n6 = new ListNode(5);
 
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
 
		printList(n1);

		n1 = mergeSort(n1);
 
		printList(n1);

	}

	public static void printList(ListNode current)
	{
		while(current!=null){
			System.out.print(current.data + " ");
			current  = current.next;
		}
		System.out.println();
	}
	
	public static ListNode mergeSort(ListNode head) {
	    if(head == null || head.next == null) 
	    {
	   		return head; 
	    }
	    ListNode middle = getMiddle(head);      //get the middle of the list
	    ListNode sHalf = middle.next; 
	    middle.next = null;   //split the list into two halfs

	    return merge(mergeSort(head),mergeSort(sHalf));  //recurse on that
	}

	private static ListNode getMiddle(ListNode head) {

		if(head == null)
		{
			return head; 
		}
	    ListNode slow, fast; slow = fast = head;
	    
	    while(fast.next != null && fast.next.next != null) {
	        slow = slow.next; 
	        fast = fast.next.next;
	    }
	    return slow;
	}
	

	private static ListNode merge(ListNode a, ListNode b) {

		ListNode dummyHead, curr; 
		dummyHead = new ListNode();
		curr = dummyHead;
		
	    while(a !=null && b!= null) {
	        if(a.data <= b.data) 
	        { 
	        	curr.next = a; 
	        	a = a.next; 
	        }
	        else 
	        { 
	        	curr.next = b;
	        	b = b.next; 
	        }
	        curr = curr.next;
	    }
	    curr.next = (a == null) ? b : a;
	    return dummyHead.next;
	}
}

class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}

	public ListNode() {

	}
}