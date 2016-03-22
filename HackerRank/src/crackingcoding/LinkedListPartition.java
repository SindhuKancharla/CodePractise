package crackingcoding;


public class LinkedListPartition {

	public static void main(String[] args){
	
		MyLL ll = new MyLL();
		ll.add(1);
		ll.add(10);
		ll.add(20);
		ll.add(100);
		ll.add(30);
		ll.add(4);
		
		ll.delete(4);
		ll.add(2);
		ll.add(5);
		ll.add(9);
		
		ll.print();
		
		partition(ll,30);
		
	}

	private static void partition(MyLL ll, int x) {

		Node cur = ll.head;
		Node pivotIndex = ll.head;
		Node pivot = ll.head;
		
		Node tmp,nxt = null;
		
		while(pivot!=null && pivot.data!=x)
		{
			pivot = pivot.next;
		}
		System.out.println("pivot = "+pivot.data);
		
		while(cur!=null){
			
			if(cur.data <= x){
				System.out.println("cur = "+cur.data + " pi = "+pivotIndex.data +" pinext = "+pivotIndex.next.data);
				nxt = cur.next;
				
				cur.next = pivotIndex;
				
				pivotIndex = cur;
				//System.out.println("----cur = "+cur.data + " pi = "+pivotIndex.data +" pinext = "+pivotIndex.next.data);

				cur = nxt;
			}
			else{
				cur = cur.next;
			}
			//ll.print();

		}
		System.out.println( " pi = "+pivotIndex.data + " pinext = "+pivotIndex.next.data);
//		while(pivotIndex!=null)
//		{
//			System.out.println(pivotIndex.data);
//			pivotIndex = pivotIndex.next;
//		}
		tmp = pivotIndex.next;
		pivotIndex.next = pivot;
		pivot.next = tmp;
		ll.print();
	}
	
	
}
