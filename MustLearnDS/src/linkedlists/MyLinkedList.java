package linkedlists;

public class MyLinkedList {

	public Node head;
	
	public Node addInBeginning(Object data)
	{
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
		
		return head;
	}
	
	public Node add(Object data){
		
		Node newnode = new Node(data);
		if(head==null){
			head = newnode;
			//System.out.println("head = "+head.data);
			return head;
		}
		
		Node cur = head;
		while(cur.next!=null)
		{
			cur = cur.next;
		}
		cur.next = newnode;
		return head;
	}
	
	public void remove(Object data){
	
		Node cur = head;

		while(cur.data != data && cur.next!=null){
			cur = cur.next;
		}
		cur.next = cur.next.next;
	}
	
	public Node recursiveReverse(Node head){
				
		if(head.next==null)
			return head;
		
		Node rem = recursiveReverse(head.next);
		
		head.next.next = head;
		head.next = null;
		
		return rem;
	}
	
	public Node reverse(){
		
		Node prev=null,nxt = null;
		
		while(head!=null){
			nxt = head.next;
			head.next = prev;
			prev = head;
			head = nxt;
		}
		return prev;
	}

	public void print(Node head){
		
		Node cur = head;
		while(cur!=null){
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args){
		
		MyLinkedList list = new MyLinkedList();
		list.add(0);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(1);
		
		//list.print(list.head);
		//Node hd = list.reverse();
		//list.print(hd);
		
		Node hdr = list.recursiveReverse(list.head);
		list.print(hdr);
	}
}


