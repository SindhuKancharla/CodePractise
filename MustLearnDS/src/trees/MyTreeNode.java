package trees;

public class MyTreeNode {
	int data;
	MyTreeNode left;
	MyTreeNode right;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public MyTreeNode getLeft() {
		return left;
	}

	public void setLeft(MyTreeNode left) {
		this.left = left;
	}

	public MyTreeNode getRight() {
		return right;
	}

	public void setRight(MyTreeNode right) {
		this.right = right;
	}

	public MyTreeNode(int data, MyTreeNode left, MyTreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public MyTreeNode(int data) {
		this.data = data;
	}

}
