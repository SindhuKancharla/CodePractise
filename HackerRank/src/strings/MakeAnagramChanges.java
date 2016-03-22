package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MakeAnagramChanges {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);

		int n = Integer.valueOf(in.nextLine());
		for(int k=0;k<n;k++)
		{
			int count = 0;

			String sen = in.nextLine();
			int mid = sen.length()/2;
			String s = sen.substring(0,mid);
			String t = sen.substring(mid);
			
			//System.out.println(s);
			//System.out.println(t);
			if(s.length()!=t.length())
			{
				System.out.println(-1);
				continue;
			}
	
			char[] sarr = s.toCharArray();
			Arrays.sort(sarr);
			
			char[] tarr = t.toCharArray();
			Arrays.sort(tarr);
			
			
			for (int i=0;i<sarr.length;i++) {
				
				if(sarr[i]!=tarr[i])
				{
					count++;
				}
	
			}
			System.out.println(count);
		}
		in.close();

	}

}
