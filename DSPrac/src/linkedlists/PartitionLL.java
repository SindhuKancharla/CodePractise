package linkedlists;

public class PartitionLL {
	
	public static void main(String[] args){
		
		MyLinkedList list = new MyLinkedList();
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(1);
		
		list.add(9);
		
		int x = 3;
		partition(list.head,x);
	}

	private static void partition(MyNode head,int x) {

		MyLinkedList b = new MyLinkedList();
		
		MyLinkedList a = new MyLinkedList();
		
		MyNode before = b.head;
			MyNode	bcur = before;
			MyNode after= a.head;
			MyNode acur = after;
				
		while(head !=null){
			
			MyNode tmp = head.next;
			if((int)head.data < x)
			{
				if(before==null)
				{
					before = head;
					bcur = before;
				}
				else
				{
					bcur.next = head;
					bcur = bcur.next;
					System.out.println(bcur.data);

				}
			}
			else if((int)head.data > x)
			{
				if(after==null)
				{
					after = head;
					acur = after;
				}
				else
				{
					after.next = head;
					acur = acur.next;
				}
			}
			head = tmp;
			
		}
		
		bcur.next = after;
		acur.next = null;
		
		while(before !=null){
			System.out.print(before.data + " ");
			before = before.next;
		}
		
	}
}
