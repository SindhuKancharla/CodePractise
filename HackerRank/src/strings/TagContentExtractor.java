package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TagContentExtractor implements Comparator<Integer> {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(100);
		
		TagContentExtractor obj = new TagContentExtractor();
		//System.out.println(obj.compare(x, y));
	
		Collections.sort(list, new TagContentExtractor());
		for(int i : list)
			System.out.println(i);
		
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			String pattern = "^[<][a-zA-Z0-9]+[>]$";
			Pattern p = Pattern.compile(pattern);
			String[] arr = p.split(line);
			
			for(String s : arr)
			{
				System.out.println(s);
			}
			testCases--;
		}
		in.close();
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1-o2;
	}
	
	
}
