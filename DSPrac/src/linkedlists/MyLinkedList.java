package linkedlists;

public class MyLinkedList {

	MyNode head;
	
	public MyNode getHead() {
		return head;
	}

	public void setHead(MyNode head) {
		this.head = head;
	}

	public MyLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.displayList();
		
		list.addInBeginning(0);
		list.displayList();
		
		list.remove(4);
		list.displayList();
	}
	
	public void addInBeginning(Object data){
		
		MyNode newnode = new MyNode(data);
		
		if(head==null){
			newnode.next = null;
			head = newnode;
		}
		else{
			newnode.setNext(head);
			head = newnode;
		}
	}
	public void add(Object data){
		
		if(head==null)
		{
			addInBeginning(data);
		}
		else{
			MyNode cur = head;
			MyNode newnode = new MyNode(data);

			while(cur.next!=null){
				cur = cur.next;
			}
			cur.next = newnode;
		}
	}
	
	public void remove(Object data){
		
		MyNode cur = head;
		if(head.data==data){
			head = head.next;
			return;
		}
		while(cur.next!=null && cur.next.getData() != data){
			cur =cur.next;
		}
		cur.next = cur.next.next;
		
	}
	public void displayList(){
		MyNode cur = head;
		while(cur !=null){
			System.out.print(cur.getData() + " ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public int size(){
		int count = 0;
		MyNode cur = head;
		while(cur!=null){
			count++;
		}
		return count;
	}
}
