package stacks;

public class PostfixEvaluation {

	public static void main(String[] args) {

		String s = "523+*";
		
		System.out.println(eval(s));
	}

	private static int eval(String s) {

		NewStack st = new NewStack();
		
		for(char c : s.toCharArray())
		{
			if(Character.isDigit(c))
			{
				st.push(Character.getNumericValue(c));
			}
			else{
				int x = (int) st.pop();
				int y = (int) st.pop();
				
				if(c=='+')
					st.push(x+y);
				else if(c=='-')
					st.push(x-y);
				else if(c=='*')
					st.push(x*y);
				else if(c=='/')
					st.push(x/y);
			}
		}
		return (int) st.pop();
	}

}
