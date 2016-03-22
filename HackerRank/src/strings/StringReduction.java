package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringReduction {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n = Integer.valueOf(in.nextLine());

		for (int i = 0; i < n; i++) {
			String s = in.nextLine();
			System.out.println(reduce(s));
		}
		in.close();
	}

	private static int reduce(String s) {

		Map<Character,Integer> list = new HashMap<>();
		list.put('a',0);
		list.put('b',1);
		list.put('c',2);
		
		int count = 0;
		char[] arr = s.toCharArray();
		
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]!=arr[i+1]){
				list.remove(arr[i]);
				list.remove(arr[i+1]);
				
				char toInsert = list.keySet().iterator().next();
				arr[i] = toInsert;
				
				for(int j=i+1;j<arr.length-i-1;j++){
					arr[j] = arr[j+1];
				}
				
			}
			
			for(char c : arr)
				System.out.print(c);
			System.out.println();
		}

		
		
		return count;
	}

	
}
