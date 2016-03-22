package linkedlists;

public class Node {
	
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
		
		public void setNext(Node next){
			this.next = next;
		}
		
		public Node getNext(){
			return this.next;
		}
	
		public Object getData(){
			return this.data;
		}
}
