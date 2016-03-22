package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Locks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static boolean check(String[] s)
	{
		List<String> list = new ArrayList<>();
		
		Stack<String> st = new Stack<>();
		
		for(String tkn : s)
		{
			if(list.contains(tkn))
			{
				return false;
			}
			else{
				list.add(tkn);
				String[] parts = tkn.split(" ");
				String cond = parts[0];
				int val = Integer.valueOf(parts[1]);
				
				String topOfStack = st.peek();
				String[] parts1 = topOfStack.split(" ");
				String condStack = parts1[0];
				int valStack = Integer.valueOf(parts1[1]);
				
				
				if(!condStack.equals(cond) && val!=valStack)
				{
					return false;
				}
			}
			
		}
		return true;
	}

}
