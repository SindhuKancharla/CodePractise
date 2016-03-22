package strings;

import java.util.ArrayList;

public class PermutationsOfString {

	public static void main (String[] args){
		
		String s = "sind";
		
		ArrayList<String> perms = getAnagrams(s);
		
		for(String wd : perms)
			System.out.println(wd);
	}

	private static ArrayList<String> getAnagrams(String str) {

		ArrayList<String> perms = new ArrayList<>();

		if(str==null || str.length()==0)
		{
			perms.add("");
			return perms;
		}
		
		char first = str.charAt(0);
		
		String remString = str.substring(1);
		
		ArrayList<String> words = getAnagrams(remString);
		for(String wd : words){
			for(int i=0;i<=wd.length();i++){
				
				String prefix = wd.substring(0,i);
				String suffix = wd.substring(i);
				perms.add(prefix + first + suffix);
			}
		}
		return perms;
	}
}
