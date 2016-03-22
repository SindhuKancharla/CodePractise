package prac.test;

import java.util.Scanner;

public class AlternatingCharacters {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());

		for(int i=0;i<n;i++){
		
			String s = sc.nextLine();
			System.out.println(numDeletions(s));
		}
		
		sc.close();
	}
	
	public static int numDeletions(String s){
		
		char[] arr = s.toCharArray();
		int count = 0;
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			if(arr[i]==arr[i+1])
				count++;
		}
		
		return count;
	}

}
