package linkedlists;

import org.junit.Test;

public class SinLinkedList {

	public SinNode head;

	public SinNode insertSort(SinLinkedList list){
		
		SinNode cur2 = head;
		SinNode tmp = null;
		while(cur2!=null){

			System.out.println(cur2.data);

			tmp = cur2.next;
			sortedInsert(cur2);
			System.out.println(" head " + head.data);
			
			cur2 = tmp;
		}
		return head;
	}
	
	public SinNode recursiveReverse(SinNode head){
		
		if(head.next==null)
			return head;
		
		SinNode rem = recursiveReverse(head.next);
		
		head.next.next = head;
		head.next = null;
		
		return rem;
	}
	
	public SinNode reverse(SinLinkedList list){
	
		SinNode prev= null, nxt = null;
		
		while(head!=null){
			nxt = head.next;
			head.next = prev;
			prev = head;
			head = nxt;
		}
		head = prev;
		return head;
	}
	
	public SinNode sortedInsert(SinNode newnode) {

		if (head == null) {
			System.out.println(" Head is null initially ");
			head = newnode;
			return head;
		}
		if(head.data >= newnode.data){
			SinNode tmp = head;
			newnode.next = tmp;
			head = newnode;
			return head;
		}
		else{
			SinNode cur = head;
			while(cur.next!=null && cur.data < newnode.data){
				cur = cur.next;
			}
			cur.next = newnode;
		}
		return head;
	}

	public SinNode insertNth(int index,SinNode newnode){
		
		SinNode cur = head;
		SinNode tmp = null;
		if(head==null && index==0){
			head=newnode;
			return head;
		}
		
		if(index==0){
			SinNode tmp1 = head;
			newnode.next = tmp1;
			head = newnode;
			return head;
		}
		while(cur !=null && --index>0){
			cur = cur.next;
		}
		
		if(cur.next!=null)
			tmp = cur.next;
		
		cur.next = newnode;
		newnode.next = tmp;
		
		return head;
	}

	public void remove(int index){
		SinNode cur = head;
		while(cur !=null && index>0){
			cur = cur.next;
			index--;
		}
		cur.next = cur.next.next;
	}
	
	public void display(){
		SinNode cur = head;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public void display(SinNode cur){
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	
	@Test
	public void testRecursiveReverse(){
		
		SinLinkedList list = new SinLinkedList();
		list.insertNth(0, new SinNode(10));
		list.insertNth(1, new SinNode(20));
		list.insertNth(2, new SinNode(30));
		list.insertNth(3, new SinNode(40));
		list.insertNth(4, new SinNode(50));
		list.display();
		SinNode cur = list.recursiveReverse(head);
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
		
		//list.display();
	}
	
	@Test
	public void testInsertSort()
	{
		SinLinkedList list = new SinLinkedList();
		list.insertNth(0, new SinNode(1));
		list.display();
		
		list.insertNth(1, new SinNode(0));
		list.display();
		
		list.insertNth(2, new SinNode(20));
		list.display();
		list.insertNth(3, new SinNode(3));
		list.display();
		list.insertNth(4, new SinNode(40));
		list.display();
		
		insertSort(list);
		list.display();
	}
	
	@Test
	public void testSortedInsert() {
	
		SinLinkedList list = new SinLinkedList();
		SinNode newnode = new SinNode(0);
		list.sortedInsert(newnode);
		list.display();
		newnode = new SinNode(-1);
		list.sortedInsert(newnode);
		list.display();
		newnode = new SinNode(-3);
		list.sortedInsert(newnode);
		list.display();
		newnode = new SinNode(-3);
		list.sortedInsert(newnode);
		list.display();
		newnode = new SinNode(5);
		list.sortedInsert(newnode);
		list.display();
	}
	
	@Test
	public void testInsertNth(){
		
		SinLinkedList list = new SinLinkedList();
		list.insertNth(0, new SinNode(1));
		list.display();
		
		list.insertNth(0, new SinNode(0));
		list.display();
		
		list.insertNth(1, new SinNode(20));
		list.display();
		list.insertNth(3, new SinNode(30));
		list.display();
		list.insertNth(4, new SinNode(40));
		list.display();
	}
	
	@Test
	public void testReverseList()
	{
		SinLinkedList list = new SinLinkedList();
		list.insertNth(0, new SinNode(10));
		list.insertNth(1, new SinNode(20));
		list.insertNth(2, new SinNode(30));
		list.insertNth(3, new SinNode(40));
		list.insertNth(4, new SinNode(50));
		list.display();
		list.reverse(list);
		list.display();
	}
	
}
