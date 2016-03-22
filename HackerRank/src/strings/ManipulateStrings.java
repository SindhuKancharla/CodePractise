package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ManipulateStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		s = s.replace("'", " ");
		s = s.replace("?", " ");
		s = s.replace(",", " ");
		s = s.replace("!", " ");
		s = s.replace(".", " ");
		s = s.replace("_", " ");
		s = s.replace("@", " ");
		
		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		scan.close();
	}
}
