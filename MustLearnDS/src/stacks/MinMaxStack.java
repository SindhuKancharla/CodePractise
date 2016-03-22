package stacks;

public class MinMaxStack {

	public static void main(String[] args) {

		MyStack st = new MyStack();
		st.push(1);
		
		st.display();
		
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		st.display();

		System.out.println(st.peek());
		System.out.println(st.pop());
		
		st.push(-1);
		st.display();
		
		int min = (int)getMinimumOfStack();
		System.out.println("Min  = "+min);
		
		st.pop();
		 min = (int)getMinimumOfStack();
		System.out.println("Min  = "+min);

	}
	
	static MyStack minStack = new MyStack();	
	
	public static void pushMinStack(Object data)
	{		
		if (minStack.top==-1)
		{
			minStack.push(data);
			minStack.top++;
		}
		else{
			if((int)minStack.peek()>(int)data)
			{
				minStack.push(data);
				minStack.top++;

			}
		}
		System.out.println("min stck");
		minStack.display();
	}


	public static void popMinStack(Object data) {

		System.out.println("min stack pop");
		minStack.display();
		
		
		if((int)minStack.peek() == (int)data)
		{
			System.out.println("popped from min stack");
			minStack.pop();
		}
		
	}

	public static Object getMinimumOfStack()
	{
		return minStack.peek();
	}
}
