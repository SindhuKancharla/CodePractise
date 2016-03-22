package linkedlists;

public class ReverseLLFrommton {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
//		for(int i = 1;i<10;i++)
//			list.add(i);
		
		list.add(3);
		list.add(5);
		
		int m = 1,n=2;
		Node root = reverse(list.head,m,n);
		while(root!=null)
		{
			System.out.print(root.data+" ");
			root= root.next;
		}
		System.out.println();
	}

	private static Node reverse(Node head, int m, int n) {

		Node prev =null;
		Node cur = head;
		int index = 1;
		while(index<m)
		{
			prev = cur;
			cur = cur.next;
			index++;	
		}
		
		Node head_rev = reverseList(cur,index-1,n);
		if(prev!=null)
			prev.next = head_rev;
		
		else
			return head_rev;
		
		return head;
	}

	private static Node reverseList(Node head,int index, int n) {

		Node tmp = head;
		Node prev=null,nxt = null;
		while(index<n)
		{
			nxt = head.next;
			head.next = prev;
			prev = head;
			head = nxt;
			index++;
			
		}
		System.out.println(prev.data + " "+ prev.next.data);
		if(head!=null)
			tmp.next = head;
		//System.out.println(head.data);
		return prev;
	}

}
