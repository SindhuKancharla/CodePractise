package linkedlists;

public class SwapNodesWithLinks {

	public static void main(String args[]) {

		ListNode n1 = new ListNode();
		ListNode n2 = new ListNode();
		ListNode n3 = new ListNode();
 
		ListNode n4 = new ListNode();
		ListNode n5 = new ListNode();
		ListNode n6 = new ListNode();

		n1.next = n2;
		n1.data = 10;
		
		n2.next = n3;
		n2.data = 15;
		
		n3.next = n4;
		n3.data = 12;
		
		n4.next = n5;
		n4.data = 13;
		
		n5.next = n6;
		n5.data = 20;
		
		n6.data = 14;
		printList(n1);

		swap(n1,12,20); 
		printList(n1);
	}

	public static void printList(ListNode current)
	{
		String output = "";
		while(current.next!=null){
			output += current.data + "->";
			current  = current.next;
		}
		output+= current.data;
		System.out.println(output);
	}
	
	
	private static void swap(ListNode head, int x, int y) {

		ListNode xprev = null, yprev = null;
		
		ListNode currentx = head;
		ListNode currenty = head;

		while(currentx !=null && currentx.data != x)
		{
			xprev = currentx;
			currentx = currentx.next;
		}
		
		while(currenty !=null && currenty.data != y)
		{
			yprev = currenty;
			currenty = currenty.next;
		}
		
		if(xprev ==null)
			head = currenty;
		else
			xprev.next = currenty;
		
		if(yprev ==null)
			head = currentx;
		else
			yprev.next = currentx;
		
		ListNode temp = currentx.next;
		currentx.next = currenty.next;
		currenty.next = temp;
	}
}
