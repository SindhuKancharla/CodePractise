package linkedlists;

public class AlternativeSplit {
	
	public static void main(String[] args){
				
		SinLinkedList list = new SinLinkedList();
		
		SinLinkedList a = new SinLinkedList();
		SinLinkedList b = new SinLinkedList();

		list.insertNth(0, new SinNode(1));

		list.insertNth(1, new SinNode(2));		
		list.insertNth(2, new SinNode(3));
		list.insertNth(3, new SinNode(4));
		list.insertNth(4, new SinNode(5));
		list.insertNth(5, new SinNode(6));
		list.insertNth(6, new SinNode(7));

		alternateSplit(list);

		a.insertNth(0, new SinNode(1));
		a.insertNth(1, new SinNode(3));
		a.insertNth(2, new SinNode(5));
		a.insertNth(3, new SinNode(7));
		
		
		b.insertNth(0, new SinNode(2));
		b.insertNth(1, new SinNode(4));
		b.insertNth(2, new SinNode(6));
		b.insertNth(3, new SinNode(8));
		b.insertNth(4, new SinNode(9));
		b.insertNth(5, new SinNode(10));

		shuffleMerge(a,b);
	}

	private static void alternateSplit(SinLinkedList list) {

		
		SinNode head = list.head;
		SinNode cur = head;

		SinNode aref = null, tmp = null, tmpb = null,bref = null;

		boolean flag = false;
		
		while(cur != null){
			
			if(!flag){
				if(aref== null)
				{
					aref = cur;
					flag = true;
					
					cur = cur.next;
					aref.next = null;
					continue;
				}
				else{
					tmp = aref;
					while(tmp.next!=null){
						tmp = tmp.next;
					}
					tmp.next = cur;
					flag = true;
					cur = cur.next;
					tmp.next.next = null;
					continue;
				}
			}
			else{
				if(bref== null)
				{
					bref = cur;
					flag = false;
					
					cur = cur.next;
					bref.next = null;
					continue;
				}
				else{
					tmpb = bref;
					while(tmpb.next!=null){
						tmpb = tmpb.next;
					}
					tmpb.next = cur;
					flag = false;
					cur = cur.next;
					tmpb.next.next = null;
					continue;
				}
			}
			
		}
		
		while(aref !=null){
			System.out.print(aref.data+ " ");
			aref = aref.next;
		}
		System.out.println();
		
		while(bref !=null){
			System.out.print(bref.data+ " ");
			bref = bref.next;
		}
		System.out.println("\n.... Alternate Split complete .... ");
	}
	
	private static void shuffleMerge(SinLinkedList list, SinLinkedList list1){
		
		SinNode ahead = list.head;
		SinNode bhead = list1.head;
		
		SinNode cur = ahead;
		while(cur.next!=null && bhead!=null){
			
			SinNode tmp = cur.next;
			SinNode tmpb = bhead.next;

			cur.next = bhead;

			bhead = tmpb;
			
			cur.next.next = tmp;
			cur = cur.next.next; 
			//break;
		}
		while(ahead!=null){
			System.out.print(ahead.data + " ");
			ahead = ahead.next;
		}
		System.out.println();
	}

}
