package trees;

public class MyTreeNode {

	Object data;
	MyTreeNode left;
	MyTreeNode right;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
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

	public MyTreeNode(Object d) {
		this.data = d;
		this.left = null;
		this.right = null;
	}

	public MyTreeNode(Object i, MyTreeNode left, MyTreeNode right) {
		this.data = i;
		this.left = left;
		this.right = right;
	}
	
}
