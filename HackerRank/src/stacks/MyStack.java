package stacks;

public class MyStack {

	private int size;
	private Object[] stackArray;
	int top;
	
	public MyStack(int s) {
		
		size = s;
		stackArray = new Object[size];
		top = -1;
	}

	public void push(Object x){
		
		stackArray[++top] = x;
	}
	
	public Object pop(){
		return stackArray[top--];
	}
	
	public Object top() {
		if(top==-1)
			return -1;
		return stackArray[top];
	}
	
	public void printStack(){
		
		while(top!=-1)
		{
			System.out.println(stackArray[top--]);
		}
	}
	public static void main(String[] args){
		
		MyStack ms = new MyStack(10);
		ms.push(0);
		ms.push(2);
		ms.push(4);
		
		ms.pop();
		ms.top();
		ms.push(5);
		ms.push(30);
		ms.pop();
		ms.push(100);
		ms.printStack();
	}
}
