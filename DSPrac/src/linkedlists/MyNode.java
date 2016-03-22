package linkedlists;

public class MyNode {

	public MyNode(Object data) {
		this.data = data;
		this.setNext(null);
	}

	Object data;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	MyNode next;
	
}
