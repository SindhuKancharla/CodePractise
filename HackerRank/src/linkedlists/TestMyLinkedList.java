package linkedlists;

public class TestMyLinkedList {

	public static void main(String[] args)
	{
		MyLinkedList list = new MyLinkedList();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);

		list.add(4);

		list.addNodeAtPos(5, 1);
		//System.out.println(list);

		list.remove(2);
		//System.out.println(list);
		
		//list.reverse(list.head);
		
		System.out.println(" after reverse " +list.toString());
		
		list.recursiveReverse(list.head);

		System.out.println(list);

	}
}
