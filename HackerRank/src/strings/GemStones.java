package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {

		int count = 0;
		boolean check = true;
		List<Character> alphabets = new ArrayList<>();
		
		for(int i=97;i<123;i++)
		{
			alphabets.add((char)i);
		}
		
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		List<String> words = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			String s = in.nextLine();
			words.add(s);
		}
		
		for(char c : alphabets)
		{
			String s = String.valueOf(c);
			for(String wd : words)
			{
				if(!wd.contains(s))
				{
					check = false;
				}
			}
			if(check)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
