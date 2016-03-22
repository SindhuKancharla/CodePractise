package prac.test;

import java.util.Scanner;

public class FIndDigits {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            int num = n;
            int out = 0;
            while(n!=0)
            {
            	int digit = n%10;            	
            	
            	if(digit !=0  && num%digit==0)
            		out++;
            	
            	n = n/10;
            }
            System.out.println(out);
        }
    }

}
