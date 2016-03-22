package crackingcoding;


public class AddLists {

	public static void main(String[] args){
		
		int carry = 0;
		MyLL l1 = new MyLL();
		l1.add(7);
		l1.add(1);
		l1.add(6);
		
		Node h1 = l1.head;
		MyLL l2 = new MyLL();

		l2.add(5);
		l2.add(9);
		l2.add(2);
		Node h2 = l2.head;
		
		MyLL l3 = new MyLL();
		Node h3 = l3.head;
	
		l1.print();
		l2.print();
		
		Node cur = h3;
		while(h1 != null){
			int sum = h1.data + h2.data;
			
			if(carry>0){
				sum = sum + carry;
				carry = 0;
			}
			if(sum>9){
				carry=1;
				sum = sum % 10;
			}
			
			Node node = new Node();
			node.data = sum;
			node.next = null;
			
			if(cur==null)
			{
				cur = node;
				h3 = cur;
			}
			else
			{
				cur.next = node;
				cur = cur.next;
			}
			
			h1 = h1.next;
			h2 = h2.next;

		}
		cur.next = null;
		
		while(h3!=null){
			System.out.print(h3.data + " ");
			h3 = h3.next;
		}
		l3.print();
		
	}
}
