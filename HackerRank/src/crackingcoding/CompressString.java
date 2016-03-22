package crackingcoding;

import java.util.HashMap;
import java.util.Map.Entry;

public class CompressString {

	public static void main(String[] args)
	{
		String str = "aabcccccddd";
		char[] arr = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i]))
			{
				int tm = map.get(arr[i]);
				map.put(arr[i], ++tm);
			}
			else
				map.put(arr[i],1);
		}
		StringBuilder sb = new StringBuilder();
		for(Entry<Character,Integer> en : map.entrySet()){
			sb.append(en.getKey());
			sb.append(en.getValue());
		}
		
		System.out.println(sb.toString());
	}
}
