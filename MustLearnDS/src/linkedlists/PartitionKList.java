package linkedlists;

public class PartitionKList {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(2);
		
		Node t = partition(list,3);
		
		while(t!=null)
		{	
			System.out.print(t.data + " ");
			t = t.next;
		}
	}

	private static Node partition(MyLinkedList list, int k) {

		Node head = list.head;
		
		Node pivotIndex = new Node(0);
		Node pivotcur = pivotIndex;
		
		Node rootIndex = new Node(0);
		Node rootcur = rootIndex;
		
		Node cur = head;
		
		while(cur!=null)
		{
			Node tmp = cur.next;
			if((int)cur.data<k)
			{
				pivotcur.next = cur;
				pivotcur  = cur;
				pivotcur.next = null;	
			}
			else{
				rootcur.next = cur;
				rootcur = cur;
				rootcur.next = null;
			}
			cur = tmp;
		}
		
		pivotcur.next = rootIndex.next;
		return pivotIndex.next;
		
	}

}
