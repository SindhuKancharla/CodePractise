package linkedlists;

public class SwapNodesInPairs {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		MyNode hd = swapPairs(list.head);
		while(hd != null){
			System.out.println(hd.data);
			hd = hd.next;
		}
	}

	private static MyNode swapPairs(MyNode head) {

		int m = 3;
		
		MyNode cur = head;
		
		int size = size(head);
		if(size<m)
			return head;
		
		MyNode prev = cur;
		prev = reverse(cur,m);
	
			while(prev != null){
				System.out.print(prev.data + " ");
				prev = prev.next;
			}
			System.out.println();
		
		return prev;
	}
	
	private static MyNode reverse(MyNode head, int m)
	{
		MyNode prev= null, nxt = null;
		int k = m;
		MyNode tmp = head;
		while(head != null && k>0)
		{
			nxt = head.next;
			head.next = prev;
			prev = head;
			head = nxt;
			k--;
		}
		
		int remSize = size(nxt);
		
		if(remSize >= m)
		{
			tmp.next = reverse(nxt,m);
		}
		else{
			tmp.next = nxt;
		}
		return prev; 
	}
	
	public static int size(MyNode head)
	{
		int cnt = 0;
		while(head !=null)
		{
			cnt++;
			head = head.next;
		}
		return cnt;
	}
	
	

}
