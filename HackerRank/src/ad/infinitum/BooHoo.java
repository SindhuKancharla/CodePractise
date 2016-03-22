package ad.infinitum;

import java.util.Scanner;

public class BooHoo {

	public static void main(String[] args){
		
		Scanner is = new Scanner(System.in);
		
		int  n =is.nextInt();
		
		for(int i=1;i<=n;i++){
			
			if(i%15 ==0)
				System.out.println("BooHoo");
			else if(i%5==0)
				System.out.println("Hoo");
			else if(i%3==0)
				System.out.println("Boo");
			else
				System.out.println(i);
		}
		
		is.close();
	}
}
