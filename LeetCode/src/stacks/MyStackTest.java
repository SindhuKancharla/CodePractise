package stacks;

public class MyStackTest {

	public static void main(String[] args) {

		MyStack st = new MyStack();
		st.push(1);
		st.push(2);
		st.push(3);
		
		st.print();
		
		st.pop();
		st.print();
	}

}
