package stacks;

public class TestMyStack {

	public TestMyStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		MyStack st = new MyStack();
		st.push(1);
		
		st.display();
		
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println(st.pop());
		st.display();
	}

}
