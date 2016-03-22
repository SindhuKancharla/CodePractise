package linkedlists;

public class GroupOddNodes {

	public static void main(String[] args)
	{
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		MyNode oddevenhd = groupOdds(list.head);
		while(oddevenhd != null)
		{
			System.out.print(oddevenhd.data+ " ");
			oddevenhd = oddevenhd.next;
		}
	}

	private static MyNode groupOdds(MyNode head) {

		MyNode evenHead = head.next;
		MyNode oddhead = head;
		
		MyNode oddcur = oddhead;
		MyNode evencur = evenHead;
		
		head = head.next;
		if(head !=null)
		    head = head.next;
		    
		
		while(head != null)
		{			
			oddcur.next = head;
			evencur.next = head.next;
			
			head = head.next;
			if(head !=null)	
				head = head.next;
			
			oddcur = oddcur.next;
			evencur = evencur.next;
		}
		
		oddcur.next = evenHead;
		return oddhead;
		
	}

	private static MyNode getMid(MyNode head) {

		MyNode fastptr = head;
		MyNode slowptr = head;
		
		while(fastptr !=null){
			fastptr = fastptr.next;
			
			if(fastptr !=null)
			{
				fastptr = fastptr.next;
				slowptr = slowptr.next;
			}
		}
		return slowptr;
	}
}
