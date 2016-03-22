package dynamic.programming;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	static List<String> dict = new ArrayList<>();

	public static void main(String[] args) {

		dict.add("leet");
		dict.add("co");
		dict.add("code");
		
		System.out.println(check("leetcode"));
		System.out.println(dpcheck("leetcode"));

	}

	private static boolean check(String str) {

		int len = str.length();
		
		if(len==0)
			return true;
		
		for(int i=1;i<=len;i++)
		{
			String prefix = str.substring(0,i);
			
			if(dict.contains(prefix))
			{
				String rem = str.substring(i);
				if(check(rem))
				{
					return true;
				}
				
			}
		}
		return false;
	}
	
	private static boolean dpcheck(String str)
	{
		boolean[] t = new boolean[str.length()+1];
		
		t[0] = true;
		
		for(int i=0;i<str.length();i++)
		{
			if(!t[i])
				continue;

			for(String a: dict)
			{
				int len = a.length();
				int end = i+len;
				if(end>str.length())
					continue;
				
				if(t[end])
					continue;
				
				//System.out.println(end+" "+str.substring(i,end) + " " + a);
				if(str.substring(i,end).equals(a))
				{
					t[end] = true;
				}
			}
		}
		return t[str.length()];
	}

}
