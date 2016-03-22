package stacks;

public class AdvncedStack {

	NewStack st = new NewStack();
	NewStack minst = new NewStack();
	
	public void push(int data)
	{
		st.push(data);
		if(minst.isEmpty() || (int)minst.peek()>data)
		{
			minst.push(data);
		}
	}
	
	public int pop()
	{
		int top = (int)st.pop();
		
		if(top==(int)minst.peek())
			minst.pop();
		
		return top;
	}
	
	public int peek()
	{
		return (int)st.peek();
	}
	
	private int getMinimumOfStack() {

		return (int)minst.pop();
	}
	
	private void display(){
		
		st.stack.print(st.stack.head);
	}

	public static void main(String[] args) {

		AdvncedStack st = new AdvncedStack();
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
		
		int min = st.getMinimumOfStack();
		System.out.println("Min  = "+min);
		
		st.pop();
		 min = st.getMinimumOfStack();
		System.out.println("Min  = "+min);

		
	}

	
}
