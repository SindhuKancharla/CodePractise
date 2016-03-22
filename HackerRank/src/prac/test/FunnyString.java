package prac.test;

import java.util.Scanner;
 
public class FunnyString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			boolean check = true;

			String s = in.next();
			//System.out.println(s);
			

			char[] sarr = s.toCharArray();
			
			String r = reverse(sarr);
			
			char[] rarr = r.toCharArray();
			for(int i = 1;i<sarr.length;i++)
			{
				int ai = Integer.valueOf(sarr[i]);
				int bi = Integer.valueOf(sarr[i-1]);
				int diffs = ai-bi; 
				int air = Integer.valueOf(rarr[i]);
				int bir = Integer.valueOf(rarr[i-1]);
				int diffr = air - bir;
				
				if(Math.abs(diffs) == Math.abs(diffr))
				{
					check = check && true;
				}
				else
					check = check && false;
			}
			
			if(check)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
				
		}
		
		in.close();
	}
	
	public static String reverse(char[] sarr)
	{
		String r = "";
		
		for(int i =sarr.length-1;i>=0;i--)
		{
			r = r+sarr[i];
		}
		System.out.println(r);
		return r;
	}
}
