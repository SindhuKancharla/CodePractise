package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AnagramsOfString {

	public static void main(String[] args){
		
		String str = "aaa";
		
		List<String> perms = new ArrayList<String>();
		
		perms = getAnagrams(str);
		
		for(String p : perms)
			System.out.print(p + "\t");
		
		System.out.println();
	}

	private static List<String> getAnagrams(String str) {

		List<String> permutations = new ArrayList<>();
		
		if(str==null || str.length()==0){
			permutations.add("");
			return permutations;
		}
		
		char first = str.charAt(0);
		String remString = str.substring(1);
		
		List<String> words = getAnagrams(remString);
		
		for(String wd : words){
			for(int i=0;i<=wd.length();i++)
			{
				String prefix = wd.substring(0,i);
				String suffix = wd.substring(i);
				
				permutations.add(prefix + first + suffix);
			}
		}
		
		return permutations;
	}
}
