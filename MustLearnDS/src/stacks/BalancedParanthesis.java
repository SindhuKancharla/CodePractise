package stacks;

import java.util.HashMap;
import java.util.Map;

public class BalancedParanthesis {

	static Map<Character,Character> map = new HashMap<>();
	
	public static void main(String[] args) {

		String s = "{[(1*2)]}))+3}";
		
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		
		System.out.println(isBalanced(s));
	}

	private static boolean isBalanced(String s) {

		NewStack st = new NewStack();
		
		char[] arr = s.toCharArray();
		
		for(int i = 0;i<arr.length;i++)
		{
			char c= arr[i];

			if(map.containsKey(c))
			{
				st.push(c);
			}
			else if(map.values().contains(c))
			{
				if(st.isEmpty())
					return false;
				char top = (char) st.pop();
				if(c!=map.get(top))
				{
					return false;
				}
			}
		}
		
		return true;
	}

}
