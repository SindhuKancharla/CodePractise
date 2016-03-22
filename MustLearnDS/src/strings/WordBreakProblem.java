package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreakProblem {
	
	static List<String> dict = new ArrayList<>();

	public static void main(String[] args){
		
//		dict.add("arrays");
//		dict.add("heaps");
//		dict.add("IDeserve");
//		dict.add("platform");
//		dict.add("learn");
//		dict.add("learning");
//		dict.add("cat");
//		dict.add("dog");
//		dict.add("hotel");
//		dict.add("do");
//		dict.add("hot");
//		
//		String str = "catdoghotel";
//		
//		//substring(str);
//			
//		if(substring(str))
//			System.out.println("TRUE");
//		else
//			System.out.println("FALSE");
	List <String> list = new ArrayList<>();
	list.add("apples");
	list.add("bananas");
	list.add("apples");
	list.add("bananas");
	list.add("oranges");
	list.add("mangoes");
	
	List <String> sub  = sublist(list);

	for (String s : list){
		System.out.println(s);
	}
	System.out.println();
	
	for (String s : sub)
		System.out.println(s);
	}
	
	public static boolean substring(String str)
	{	
		System.out.println(str);
		int len = str.length();
		
		if(len==0)
			return true;
		
		String sub = "" ;
		
		for(int i=1;i<=len;i++)
		{
			String prefix = str.substring(0,i);
			System.out.println("prefix = "+prefix);
			if(dict.contains(prefix))
			{
				sub = str.substring(i);
				if(substring(sub))
					return true;
			}
		}
		
		return false;
	}
	
	
	
	public static List<String> sublist(List<String> items)
	{
		Set <String> map = new HashSet<>();
		int start = 0, end = items.size(), maxSize = -1, curr = 0;
		for (int i = 0; i < items.size(); i++)
		{
			String s = items.get(i);
			if (map.contains(items.get(i)))
			{
				
				if(maxSize < map.size())
				{
					start = map.size() - curr-1;
					end = map.size() + start - 1;
					maxSize = map.size();        
					--i;
					curr = i;
					map = new HashSet<>();
				}
				else 
				{
					--i;
					curr = i;
					map = new HashSet<>();
				}
			}
			else
			{
				map.add(s);
			}
			for (String s2 : map)
			{
				System.out.println(s2);
			}
			System.out.println(curr + " " + start + " " + end + " max " + maxSize);
			System.out.println();
		}
		System.out.println(curr + " " + start + " " + end + " max " + maxSize);
		return items.subList(start, end);
	}

}
