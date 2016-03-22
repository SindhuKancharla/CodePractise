package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FirstNonRepeatingCharacter {


	public static void main(String[] args) {

		String s = "basaajab";
		getFirstChar(s);
		getChar(s);
		
	}
	
	public static void getChar(String s)
	{		
		for(int i=0;i<s.length();i++)
		{
			boolean check = true;

			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					
					check = false;
				}
			}
			if(check)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
	
	public static void getFirstChar(String s)
	{
		Map<Character,Boolean> map = new LinkedHashMap<Character, Boolean>();
		
		for(char c:s.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, false);
			}
			else
			{
				map.put(c, true);
			}
		}
		
		for(Entry<Character,Boolean> en : map.entrySet())
		{
			if(en.getValue())
			{
				System.out.println(en.getKey());
				break;
			}
		}
	}

}
