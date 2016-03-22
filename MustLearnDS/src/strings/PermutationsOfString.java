package strings;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {

	public static void main(String[] args) {

		String s = "abc";
		List<String> lsit = permute(s);
		
		for(String x : lsit)
		{
			System.out.println(x);
		}
	}

	private static List<String> permute(String s) {

		List<String> perms = new ArrayList<>();
		
		if(s.length()==0)
		{
			perms.add("");
			return perms;
		}
		
		char first = s.charAt(0);
		String rem = s.substring(1);
		
		List<String> words = permute(rem);
		
		for(String wd : words)
		{
			for(int i=0;i<=wd.length();i++)
			{
				String prefix = wd.substring(0, i);
				String suffix = wd.substring(i);
				
				perms.add(prefix + first+suffix);
			}
		}
		return perms;
	}

}
