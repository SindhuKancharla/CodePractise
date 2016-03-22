package linkedlists;

public class MyLinkedList {

	Node head;
	
	public MyLinkedList() {

	}
	
	public String toString(){
		
		String output = "";
		Node current = head;
		while(current.next!=null){
			output += current.getData().toString() + "->";
			current  = current.next;
		}
		output+= current.getData().toString() ;
		return output;
	}
	
	public void add(int value)
	{
		if(head==null)
		{
			head = new Node(value);
			return;
		}
		
		Node newNode = new Node(value);
		
		Node current = head;
		while(current.next!=null)
		{
			current = current.next;
		}
		current.next = newNode;
	}
	/*
	 *  Node trackedHeadNode = head;
    
    Node nodeToInsert = new Node(); nodeToInsert.data = data;
    
    //Empty List - Returned newly created node or null
    if (head==null){return nodeToInsert;}
    
    //Inserting a Node ahead of the List
    if (position == 0){nodeToInsert.next = head; return nodeToInsert;}    
    
    //Traverse the Singly Linked List to 1 Position Prior
    //Stop traversing if you reached the end of the List
    int currPosition = 0;
    
    while (currPosition < position -1 && head.next != null){
        head = head.next;        
        currPosition++;       
    }

    //Inserting a Node in-between a List or at the end of of a List
    Node nodeAtPosition = head.next;
    head.next = nodeToInsert;
    head = head.next;
    head.next = nodeAtPosition;
        
    return trackedHeadNode;
	 */
	public void addNodeAtPos(Object data,int pos)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head = new Node(data);
			return;
		}
		
		Node current = head;
		while(current.next!=null && pos>0)
		{
			pos--;
			current = current.next;
		}
		if(current.next==null)
			current.next = newNode;
		else{
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	
	public void remove(int index){
		
		Node current = head;
		Node prev = null;
		while(current!=null && index>0)
		{
			index--;
			prev = current;

			current = current.next;
		}
		if(current.next!=null)
		{
			prev.next = current.next;
		}
		else
			prev.next = null;
		
	}
	
	public void printList(Node current)
	{
		while(current!=null){
			System.out.print(current.getData().toString() + " ");
			current  = current.next;
		}
		System.out.println();
	}
		
	public int size()
	{
		int count = 0;
		while(head!=null){
			head  = head.next;
			count++;
		}
		return count;
	}
	
	public void reverse(Node head){
		
		Node prev = null;
		Node n = null;
		Node current = head;
		while( current != null)
		{
			System.out.println(current.data);
			n =  current.next;
			current.next = prev;
			prev=current;
			current = n;
		}
		head =prev;
		printList(head);
	}
	
	public Node recursiveReverse(Node root){
		
		//printList(root);

		Node cur = root;
		if(cur==null||cur.next==null)
			return cur;
		
		Node rem = recursiveReverse(cur.next);
		
		cur.next.next = cur;
		cur.next = null;
		
		//printList(root.next);

		head = rem;
		return rem;
	}
	
}