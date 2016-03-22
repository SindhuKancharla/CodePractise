package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		// checkPalindrome(A);
		String B = sc.next();

		System.out.println(checkAnagram(A, B));

		/*
		 * int n = sc.nextInt(); List<String> subs = new ArrayList<>();
		 * 
		 * for(int i=0;i<A.length()-n+1;i++){
		 * 
		 * subs.add(A.substring(i,i+n)); }
		 * 
		 * Collections.sort(subs); System.out.println(subs.get(0));
		 * System.out.println(subs.get(subs.size()-1));
		 */
		sc.close();
	}

	private static boolean checkAnagram(String A, String B) {
		// Complete the function
		char[] a = A.toLowerCase().toCharArray();
		char[] b = B.toLowerCase().toCharArray();

		if (a.length != b.length)
			System.out.println("Not Anagrams");

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	private static void checkPalindrome(String a) {

		char[] arr = a.toCharArray();

		int len = arr.length;
		int mid = len / 2;

		for (int i = 0; i < mid; i++) {

			if (arr[i] != arr[len - 1 - i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		return;
	}
}
