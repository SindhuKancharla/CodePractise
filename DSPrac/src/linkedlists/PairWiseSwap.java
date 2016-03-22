package linkedlists;

public class PairWiseSwap {

	public static void main(String[] args){
		
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		//list.add(7);
		list.displayList();
		
		pairwiseswap(list);
		
	}

	private static void pairwiseswap(MyLinkedList list) {

		MyNode cur = list.head;

		while(cur.next!=null ){
			
			int tmp = (int) cur.data;
			cur.data = cur.next.data;
			cur.next.data = tmp;
			
			cur = cur.next;
			
			if(cur.next!=null)
				cur = cur.next;
			
		}
		
		list.displayList();
	}
}
