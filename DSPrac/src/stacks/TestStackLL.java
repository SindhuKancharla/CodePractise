package stacks;

public class TestStackLL {

	public static void main(String[] args) {

		StackLL st = new StackLL();
		st.push(1);
		st.push(2);
		st.push(3);
		
		st.display();
		
		st.pop();
		st.display();
	}

}
