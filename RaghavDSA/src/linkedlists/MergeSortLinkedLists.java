package linkedlists;

import java.awt.DisplayMode;

public class MergeSortLinkedLists {

	public static void main(String[] args){
		
		SinLinkedList list = new SinLinkedList();
		
		int i=0;
		list.insertNth(i++, new SinNode(23));
		list.insertNth(i++, new SinNode(3));
		list.insertNth(i++, new SinNode(2));
		list.insertNth(i++, new SinNode(26));
		list.insertNth(i++, new SinNode(30));
		list.insertNth(i++, new SinNode(13));
		list.insertNth(i++, new SinNode(53));

		list.display();
		display(mergeSort(list.head));
	}
	
	public static void display(SinNode cur){
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	private static SinNode mergeSort(SinNode head) {

		if(head ==null || head.next ==null)
			return head;
		
		SinNode sechalf = splitIntoTwoHalves(head);

		return MergeLinkedLists.sortedMerge(mergeSort(head), mergeSort(sechalf));
		
	}

	private static SinNode splitIntoTwoHalves(SinNode head) {

		SinNode fastptr = head,slowptr = head;
		
		while(fastptr.next !=null){
			
			fastptr = fastptr.next;
			if(fastptr.next!=null){
				fastptr = fastptr.next;
				slowptr = slowptr.next;
			}
		}
		SinNode b = slowptr.next;

		slowptr.next = null;
		
		return b;
	}
}
