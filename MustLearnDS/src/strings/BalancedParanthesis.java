package strings;

import java.util.HashMap;
import java.util.Map;

import linkedlists.MyLinkedList;
import linkedlists.Node;

public class BalancedParanthesis {

	static Map<Character,Character> symbols = new HashMap<>();
	
	public static void main(String[] args){
		
		symbols.put('(', ')');
		symbols.put('{', '}');
		symbols.put('[', ']');
		
		boolean check = true;
		String str= "{([}";
		
		char[] bracks = str.toCharArray();
		
		MyStack stack = new MyStack();
		
		for(char c : bracks){
			
			if(symbols.containsKey(c))
			{
				stack.push(c);
			}
			else if(symbols.values().contains(c))
			{
				if(stack.top!=-1){
					char top = stack.pop();
					if(symbols.get(top)==c){
						check &= true;
					}
					else{
						check &= false;
					}
				}
				else{
					check &= false;
				}
			}
		}
		System.out.println(check);
//		stack.push(Character.valueOf('{'));
//		
//		stack.print();
//		stack.push(Character.valueOf('('));
//		
//		stack.push(Character.valueOf('['));
//		stack.push(Character.valueOf(']'));
//		stack.push(Character.valueOf('h'));
//		stack.print();
//		System.out.println(stack.pop());
//		stack.push(Character.valueOf('u'));
//		stack.print();
	}
	
}

class MyStack{
	
	MyLinkedList stackList = new MyLinkedList();
	int top = -1;
	
	public void push(Character data){
		top++;
		stackList.add(data);
	}
	
	public char pop(){
		Node head = stackList.head;
		Node cur = head;
		
		if(cur.getNext()==null){
			char c = (char) cur.getData();
			cur = null;
			return c;
		}
		while(cur.getNext().getNext()!=null){
			cur = cur.getNext();
		}
		char c = (char) cur.getNext().getData();
		
		cur.setNext(null);
		return c;
	}
	
	public void print(){
		
		this.stackList.print(this.stackList.head);

	}
}