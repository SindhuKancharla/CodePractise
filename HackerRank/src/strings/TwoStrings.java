package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);

		int n = Integer.valueOf(in.nextLine());
		for(int k=0;k<n;k++)
		{

			String out = "NO";

			String s = in.nextLine();
			String t = in.nextLine();
			
			List<String> ssubs = new ArrayList<>();
			
			for(int i=0;i<s.length();i++)
			{
					String sub = s.substring(i,i+1);
					System.out.println(sub);
					if(!ssubs.contains(sub))
						ssubs.add(sub);
			}
			
			for(String x : ssubs)
			{
				if(t.contains(x))
				{
					System.out.println(x);
					out = "YES";
					break;
				}
			}
			System.out.println(out);
		}
		in.close();
	}
}
