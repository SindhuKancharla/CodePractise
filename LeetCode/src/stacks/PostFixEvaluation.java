package stacks;

public class PostFixEvaluation {

	public static void main(String[] args) {

		String s = "435+/";
		
		int x = eval(s);
		System.out.println(x);
	}

	private static int eval(String s) {

		MyStack st = new MyStack();
		
		char[] tokens = s.toCharArray();
		
		for(char c: tokens)
		{
			if(Character.isDigit(c))
			{
				st.push(Character.getNumericValue(c));
			}
			
			else 
			{
				int x = (int)st.pop();
				int y = (int)st.pop();
				
				switch(c)
				{
					case '+':
					{
						st.push(x+y);
						break;
					}
					case '-':
					{
						st.push(x-y);
						break;
					}
					case '*':
					{
						st.push(x*y);
						break;
					}
					case '/':
					{
						st.push(x/y);
						break;
					}
				}
			}
		}
		
		return (int)st.pop();
	}

}
