package linkedlists;

public class SinNode {


		public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SinNode getNext() {
		return next;
	}

	public void setNext(SinNode next) {
		this.next = next;
	}

		int data;
		 SinNode next;

		public SinNode(int val) {
			this.next = null;
			this.data = val;
		}

		public SinNode(int val, SinNode next) {
			this.data = val;
			this.next = next;
		}
	

}
