package maths;

import java.util.Scanner;

public class SHerlockCounting {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {

			int count = 0;
			int N = in.nextInt();
			int K = in.nextInt();
			
			long pro = N*K;
			
			for(int j=K;j<N;j++)
			{
				if((N*j - pro) <= j*j )
					count++;
			}
			System.out.println(count);
		}
		in.close();
	}
}
