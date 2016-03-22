package stacks.queues;

public class SinStack {

	int[] stackArray;
	int top = -1;

	int[] minStackArray;
	int mintop = -1;
	
	public SinStack(int size) {
		this.stackArray = new int[size];
		this.minStackArray = new int[size];
	}

	public void push(int data) {
		stackArray[++top] = data;
		
		if(mintop==-1)
		{
			minStackArray[++mintop]=data;
		}
		else{
			if(minStackArray[mintop] > data)
				minStackArray[++mintop] = data;
		}
	}

	public int pop() {
		
		int popval = stackArray[top--];
		if(minStackArray[mintop]==popval)
		{
			mintop--;
		}
		return popval;
	}

	public int peek() {
		System.out.println(stackArray[top]);
		return stackArray[top];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public void printStack() {
		for (int i = 0; i < stackArray.length; i++) {
			System.out.println(stackArray[i]);
		}
	}

	public int findMinOfStack(){		
		
		System.out.println(minStackArray[mintop]);
		return minStackArray[mintop];
	}
	
	public static void main(String[] args) {

		SinStack stack = new SinStack(10);

		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);

		stack.pop();
		
		stack.push(2);
		stack.push(1);
		
		stack.pop();

		stack.findMinOfStack();
		
		stack.pop();
		stack.findMinOfStack();
	}
}
