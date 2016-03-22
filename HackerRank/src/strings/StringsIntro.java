package strings;

import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());
		
		if(A.compareTo(B)>0){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
		String b = A.substring(0, 1);
		b = b.toUpperCase();

		A = b + A.substring(1);

		String c = B.substring(0, 1);
		c = c.toUpperCase();

		B = c + B.substring(1);


		System.out.println(A + " "+ B);
		sc.close();
	}
}
