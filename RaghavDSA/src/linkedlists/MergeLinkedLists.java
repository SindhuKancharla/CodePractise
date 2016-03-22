package linkedlists;

public class MergeLinkedLists {

	public static void main(String[] args){
		
		SinLinkedList a = new SinLinkedList();
		SinLinkedList b = new SinLinkedList();
		
		
		a.insertNth(0, new SinNode(1));
		a.insertNth(1, new SinNode(3));
		a.insertNth(2, new SinNode(5));
		a.insertNth(3, new SinNode(7));
		
		
		b.insertNth(0, new SinNode(2));
		b.insertNth(1, new SinNode(4));
		b.insertNth(2, new SinNode(6));
		
		MergeSortLinkedLists.display(sortedMerge(a.head,b.head));
		
		
	}

	static SinNode sortedMerge(SinNode ahd, SinNode bhd) {

		//MergeSortLinkedLists.display(ahd);
		//MergeSortLinkedLists.display(bhd);
		SinNode chd;
		
		if(ahd.data < bhd.data)
		{
			chd = ahd;
			ahd = ahd.next;
		}
		else
		{
			chd = bhd;
			bhd = bhd.next;
		}
		
		SinNode cur = chd;
		
		while(ahd !=null && bhd!=null){
			
			if(ahd.data < bhd.data){
				SinNode tmp = ahd.next;
				
				cur.next = ahd;
				
				ahd = tmp;
				
				cur = cur.next;
			}
			else{
				
				SinNode tmp2 = bhd.next;
				
				cur.next = bhd;
				
				bhd = tmp2;
				
				cur = cur.next;
			}
		}
		
		while(ahd != null){
			SinNode mtp = ahd.next;
			cur.next = ahd;
			ahd = mtp;
			cur = cur.next;
		}
		
		while(bhd != null){
			SinNode mtp = bhd.next;

			cur.next = bhd;
			bhd = mtp;
			cur = cur.next;
		}
		
//		while(chd!=null){
//			System.out.print(chd.data + " ");
//			chd = chd.next;
//		}
//		System.out.println();
		
		return chd;
	}
}
