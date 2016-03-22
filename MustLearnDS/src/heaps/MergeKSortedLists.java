package heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import linkedlists.MyLinkedList;
import linkedlists.Node;

public class MergeKSortedLists {

	public static void main(String[] args) {

		List<Node> lists = new ArrayList<>();
		
		MyLinkedList l1 = new MyLinkedList();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		l1.add(9);
		
		MyLinkedList l3 = new MyLinkedList();
		l3.add(3);
		l3.add(5);
		l3.add(13);
		
		MyLinkedList l2 = new MyLinkedList();
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(8);
		
		lists.add(l2.head);
		lists.add(l1.head);
		lists.add(l3.head);
		
		Node head = kmerge(lists);
		while(head!=null)
		{
			System.out.print(head.getData()+ " ");
			head = head.getNext();
		}
		System.out.println();
	}

	private static Node kmerge(List<Node> lists) {

		
		PriorityQueue<Node> q = new PriorityQueue<Node>(lists.size(), 
				new Comparator<Node>() {

					@Override
					public int compare(Node o1, Node o2) {

						if((int)o1.getData()> (int)o2.getData())
							return 1;
						else if((int)o1.getData()< (int)o2.getData())
							return -1;
						else
							return 0;
					}
			
		});
		
		for(Node listHead : lists)
		{
			q.add(listHead);
		}
		
		Node head = new Node(0);
		Node cur = head;
		
		while(!q.isEmpty())
		{
			Node top = q.poll();
			cur.setNext(top); 
			
			if(top.getNext()!=null)
				q.add(top.getNext());
			
			cur = cur.getNext();
		}
		
		return head.getNext();
	}

}
