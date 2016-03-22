package linkedlists;

public class ReverseKNodes {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		
		int  k = 4;
		Node head =  rev(list.head,k);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
		
	}
	
	private static int size(Node head)
	{
		int len = 0;
		while(head!=null)
		{
			len++;
			head = head.next;
		}
		return len;
		
	}
	
	private static Node rev(Node head,int k){
		
		if(head==null)
			return head;
		
		Node prev = null;
		Node nxt = null;
		int index = 0;
		
		Node tmp_head = head;
		
		while(index<k )
		{
			nxt = head.next;
			head.next = prev;
			prev = head;
			head = nxt;
			index++;
		}
		
		if(size(nxt)>k)
			tmp_head.next = rev(nxt,k);
		else
			tmp_head.next = nxt;
		return prev;
		
	}

}
