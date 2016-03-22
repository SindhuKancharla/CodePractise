package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {

		String str = "Salesforce is the best company to work for";
		char first = findFirst(str);
		System.out.println("first char = "+first);
		findFirst2(str);
		
	}

	private static char findFirst(String str) {

		str = str.toLowerCase();
		char ret = 0;
		int[] dict = new int[256];
		
		for(int i =0;i<str.length();i++)
		{
			char cur = str.charAt(i);
			dict[cur] += 1;
		}
		
		for(char i : str.toCharArray())
		{
			//System.out.println(i);
			if(dict[i]==1)
			{
				System.out.println(dict[i]);
				ret = i;
				break;
			}
		}
		return ret;
	}
	
	private static void findFirst2(String str)
	{
		HashMap< Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toLowerCase().toCharArray())
		{
			if(map.containsKey(ch))
			{
				int tmp = map.get(ch);
				map.put(ch, ++tmp);
			}
			else{
				map.put(ch, 1);
			}
		}
		
		for(Entry<Character,Integer> en : map.entrySet())
		{
			if(en.getValue()==1)
			{
				System.out.println(en.getKey());
				break;
			}
		}
	}

}
