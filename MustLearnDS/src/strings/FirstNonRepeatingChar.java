package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args){
		
		String str = "teeter";
		
		HashMap<Character, Boolean> mp = new LinkedHashMap<>();
		char[] sa = str.toCharArray();

		for(char c : sa)
		{
			if(mp.containsKey(c))
			{
				mp.put(c,false);
			}
			else{
				mp.put(c, true);
			}
		}
		for(Entry<Character,Boolean> en : mp.entrySet())
		{
			if(en.getValue()){
				System.out.println("first non repeated char " + en.getKey());
				break;
			}
		}

		int[] arr = new int[128];
		
		
		for(char ch : sa){
			arr[ch]++;
		}
		
		for(char ch:sa){
			if(arr[ch]==1)
			{
				System.out.println(ch);
				break;
			}
		}
	}
}
