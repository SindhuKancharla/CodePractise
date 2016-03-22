package linkedlists;

public class MyLinkedList {

	public MyNode head;
	
	public MyLinkedList() {

	}
	
	public MyNode addInBeginning(Object data)
	{
		MyNode node = new MyNode(data);
		if(head==null)
		{
			head = node;
			return head;
		}
		node.next = head;
		head = node;
		return head;
		
	}
	
	public Object removeFromBeginning()
	{
		Object data = head.data;
		head = head.next;
		return data;
	}
	
	public MyNode add(Object data)
	{
		MyNode node = new MyNode(data);
		
		if(head==null)
		{
			head = node;
			return head;
		}
		MyNode cur = head;
		while(cur.next!=null)
		{
			cur = cur.next;
		}
		cur.next = node;
		return head;
	}
	
	public void print(MyNode head)
	{
		MyNode cur = head;
		while(cur!=null)
		{
			System.out.print(cur.data+ " ");
			cur =cur.next;
		}
		System.out.println();
	}
	
	public int size(MyNode head)
	{
		int cnt = 0;
		while(head !=null)
		{
			cnt++;
			head = head.next;
		}
		return cnt;
	}
}

