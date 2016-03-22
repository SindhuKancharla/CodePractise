package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] arr = new String[]{"abc", "cba","abt","bat","cat","dog","god"};
		
		
		group(arr);
	}

	private static void group(String[] arr) {

		Map<String,List<String>> map = new HashMap<>();
		
		List<List<String>> lists = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			
			String s = arr[i];
			char[] sa = s.toCharArray();
			Arrays.sort(sa);
			
			arr[i] = new String(sa);
			if(map.containsKey(arr[i]))
			{
				List<String> list = map.get(arr[i]);
				list.add(s);
				map.put(arr[i], list);
			}
			else{
				List<String> list = new ArrayList<>();
				list.add(s);
				map.put(arr[i],list);
			}
		}
		
		
		/*Arrays.sort(arr);
		
		List<String> list = new ArrayList<>();
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println("i = "+arr[i]+ " i+1 = "+arr[i+1]);
			if(arr[i+1].equals(arr[i]))
			{
				List<String> tmp = map.get(arr[i]);
				Collections.sort(tmp);
				System.out.println(tmp);
				list.addAll(tmp);
				lists.add(list);
				list = new ArrayList<>();

				int x = map.get(arr[i]).size();
				i = i+x-1;
			}
			else{
				list.add(map.get(arr[i]).get(0));
				lists.add(list);
				list = new ArrayList<>();
				list.add(map.get(arr[i+1]).get(0));
				lists.add(list);
				//list = new ArrayList<>();
			}
		}
		
		for(List<String> l : lists)
		{
			Collections.sort(l);
			System.out.print("[");

			for(String s : l)
			{
				System.out.print(s+",");
			}
			System.out.print("]");

			System.out.println();
		}*/
		
		 for(List<String> l: map.values()){
		        //if(l.size() > 1){
		            for(String i: l){
		                System.out.print(i + " ");
		            }
		        //}
		        System.out.println();
		    }
	}

}
