package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AnagramPalindrome {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
	
		if(checkPal(in))
			System.out.println("YES");
		else
			System.out.println("NO");
//		List<String> pemrs = getAnagrams(in);
//		for(String wd : pemrs)
//		{
//			if(checkPalindrome(wd))
//			{
//				System.out.println("YES");
//				return;
//			}
//		}
//		System.out.println("NO");
		sc.close();
	}

	private static boolean checkPalindrome(String s)
	{
		int n = s.length();
		n--;
		for(int i=0;i<=n;i++){
			char a = s.charAt(i);
			char b = s.charAt(n-i);
			
			if(a!=b)
				return false;
		}
		return true;
	}
	
	private static  List<String> getAnagrams(String in) {

		List<String> perms = new ArrayList<>();
		
		if(in.length()==0)
		{
			perms.add("");
			return perms;
		}
	
		char first = in.charAt(0);
		String rem = in.substring(1);
		
		List<String> words = getAnagrams(rem);
		
		for(String wd : words)
		{
			for(int i=0;i<=wd.length();i++)
			{
				String prefix = wd.substring(0, i);
				String suffix = wd.substring(i);
				perms.add(prefix + first + suffix);
			}
		}
		return perms;
	}
	
	private static boolean checkPal(String s)
	{
		
		boolean check = true;
		
		HashMap<Character, Integer> map = new HashMap<>();
		char[] arr = s.toCharArray();
		
		for(char c : arr)
		{
			if(map.containsKey(c))
			{
				int tmp = map.get(c);
				map.put(c, ++tmp);
			}
			else
			{
				map.put(c, 1);
			}
		}
		int countOddChars = 0;

		for(int i : map.values())
		{
			if(i%2 !=0)
			{
				countOddChars++;
				if(countOddChars>1)
				{
					check= false;
					break;
				}
			}
		}
		return check;
	}
}
