package linkedlists;

public class RemoveDupsFromSortedLL {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(3);
		
		//list.print(list.head);
		list.print(removeDups(list));
	}

	private static MyNode removeDups(MyLinkedList list) {

		MyNode head = list.head;
		MyNode cur = head;
		
		while(cur!=null && cur.next!=null)
		{
			if(cur.data == cur.next.data)
			{
				cur.next = cur.next.next;
			}
			else
			{
				cur = cur.next;
			}
		}
		return head;
	}

}
