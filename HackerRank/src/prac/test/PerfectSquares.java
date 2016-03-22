package prac.test;

import java.util.Scanner;

public class PerfectSquares {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int a = in.nextInt();
            int b = in.nextInt();

            int out = 0;
            for(int i=a;i<=b;i++)
            {
            	int sqroot = (int)Math.sqrt(i);
            	if(sqroot*sqroot == i)
            	{
                    out++;
                    sqroot++;
                    for(int j=sqroot;j*j<=b;j++)
                    	out++;
                    break;
            	}
            }
            System.out.println(out);
        }
    }
}