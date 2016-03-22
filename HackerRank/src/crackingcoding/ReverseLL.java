package crackingcoding;

public class ReverseLL {

	public static void main(String[] args){
		
		MyLL list = new MyLL();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.print();
		list.recursiveReverse(list.head);
		list.print();
	}
}
