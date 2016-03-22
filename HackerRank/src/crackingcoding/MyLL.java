package crackingcoding;


public class MyLL {

	Node head;

	public void add(int data) {

		Node node = new Node(data);
		node.next = null;

		Node current = head;
		
		if(current==null)
		{
			head = node;
			return;
		}
		
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
	}

	public Node delete(int n) {

		if (n == head.data)
			return head;
		Node cur = head;
		while (cur.next.data != n && cur.next != null) {
			cur = cur.next;
		}

		cur.next = cur.next.next;
		return head;
	}

	
	public void print(){
		
		Node cur = head;
		while(cur!=null){
			System.out.print(cur.data + "\t");
			
			cur = cur.next;
		}
		System.out.println();
	}
	
	public Node recursiveReverse(Node cur){
	
		if(cur==null|| cur.next==null)
			return cur;
		
		Node rem = recursiveReverse(cur.next);
		
		cur.next.next = cur;
		cur.next = null;
		
		head = rem;
		return head;
	}
	
}
class Node {
		int data;
		Node next;

		public Node() {
			this.data = 0;
			this.next = null;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
