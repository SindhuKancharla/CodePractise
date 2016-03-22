package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class StringCompression {

	public static void main(String[] args) {

		String s = "abbcddddd";
		
		compress(s);
		System.out.println("compress in string");
		comp(s);
	}
	
	private static void comp(String s){
		
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1 || arr[i]!=arr[i+1])
			{
				sb.append(String.valueOf(arr[i])+count);
				count = 1;
			}
			else{
				count++;
			}
		}
		System.out.println(sb.toString());
	}

	private static void compress(String s) {

		char[] arr = s.toCharArray();
		Map<Character,Integer> map= new HashMap<>();
		
		for(char c : arr)
		{
			if(map.containsKey(c))
			{
				int tmp = map.get(c);
				map.put(c, ++tmp);
			}
			else{
				map.put(c, 1);
			}
		}
		
		for(Entry<Character,Integer> en : map.entrySet())
		{
			System.out.println(en.getKey()+","+en.getValue());
		}
	}

}
