package linkedlists;

public class Merge2SortedLists {

	public static void main(String[] args) {

		MyLinkedList l1 = new MyLinkedList();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		
		MyLinkedList l2 = new MyLinkedList();
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(8);
		l2.add(10);
		
		merge(l1,l2);
	}

	private static void merge(MyLinkedList l1, MyLinkedList l2) {

		MyNode h1 = l1.head;
		MyNode h2 = l2.head;
		
		MyNode h3;
		
		if((int)h1.data < (int)h2.data)
		{
			h3 = h1;
			h1 = h1.next;
		}
		else{
			h3 = h2;
			h2 = h2.next;
		}
		
		MyNode cur = h3;
		
		while(h1!=null && h2.next!=null){
			
			if((int)h1.data < (int)h2.data)
			{
				MyNode tmp = h1.next;
				cur.next = h1;
				h1 = tmp;
			}
			else
			{
				MyNode tmp = h2.next;
				cur.next = h2;
				h2 = tmp;
			}
			cur = cur.next;
		}
		
		while(h1!=null){
			cur.next = h1;
			cur = cur.next;
			h1 = h1.next;
		}
		
		while(h2!=null){
			cur.next = h2;
			cur = cur.next;
			h2 = h2.next;
		}
		
		while(h3!=null){
			System.out.print(h3.data+" ");
			h3 = h3.next;
		}
	}

}
