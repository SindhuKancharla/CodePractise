package prac.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AnagramPalindrome {

	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String is = myScan.nextLine();
        boolean pal = false;
        System.out.println(is);
        List<String> anagrams = new ArrayList<>();
        char[] arr = is.toCharArray();
        
        computeAnagrams(arr);
        
        for(String s : anagrams)
        	pal = checkPalindrome(s);
        
        if(pal)
        	System.out.println("YES");
        else
        	System.out.println("NO");
        myScan.close();
    }
	
	private static void computeAnagrams(char[] arr) {
			
		
	}

	public static boolean checkPalindrome(String is)
	{
		char[] s = is.toCharArray();
		char[] o = new char[s.length];
		
		for(int i =0;i<s.length;i++)
		{
			o[i] = s[i];
		}
		String rev = new String(o);
		System.out.println("rev = "+rev);
		if(is.equalsIgnoreCase(rev))
			return true;
		else
			return false;
		
	}
}
