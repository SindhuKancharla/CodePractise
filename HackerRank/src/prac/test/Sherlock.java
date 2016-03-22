package prac.test;

import java.util.Scanner;

public class Sherlock {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        String out = "";
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            while(n%3 >= 0)
            {
            	for(int i=0;i<n;i++)
            	{
            		out = out + "5";
            	}
            }
        }
    }
}
