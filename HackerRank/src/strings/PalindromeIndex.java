package strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = Integer.valueOf(in.nextLine());
		for(int k=0;k<n;k++)
		{
			int x = -1;
			String s = in.nextLine();
			int len = s.length();
			
			int mid = s.length()/2;
			for(int i=0;i<len;i++)
			{
				
					char em = '\0';
					String ns = s.replaceFirst(String.valueOf(s.charAt(i)),String.valueOf(em)).trim();
					System.out.println("ns = "+ns + " - "+checkPalindrome(ns));
					if(checkPalindrome(ns))
					{
						x = i;
						break;
					}
					
			}
			System.out.println(x);
		}
		in.close();
	}

	private static boolean checkPalindrome(String s)
	{
		int n = s.length();
		n--;
		for(int i=0;i<n/2;i++){
			char a = s.charAt(i);
			char b = s.charAt(n-i);
			if(a!=b)
				return false;
		}
		return true;
	}
}
