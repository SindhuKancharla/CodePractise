package crackingcoding;

import stacks.MyStack;

public class QwithStacks {
	
	static MyStack s1 = new MyStack(10);
	static MyStack s2 = new MyStack(10);
	
	public static void main(String[] args){

		
		QwithStacks.enqueue(1);
		QwithStacks.enqueue(2);
		QwithStacks.enqueue(3);

		QwithStacks.dequeue();
		QwithStacks.dequeue();

		QwithStacks.enqueue(4);
		QwithStacks.enqueue(5);
		
		QwithStacks.dequeue();
	}

	private static void dequeue() {

		if((int)s1.top()!= -1){
			System.out.println(s1.pop());
		}
		else{
			while((int)s2.top()!=-1){
				int y = (int) s2.pop();
				s1.push(y);
			}
			System.out.println(s1.pop());
		}
	}

	private static void enqueue(int i) {

//		while((int)s2.top()!=-1){
//			int y = (int) s2.pop();
//			s1.push(y);
//		}
		s2.push(i);
		
	}
}
