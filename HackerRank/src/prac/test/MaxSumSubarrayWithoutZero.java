package prac.test;

import java.util.Scanner;

public class MaxSumSubarrayWithoutZero {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		int maxsum = -100000;
		
		int sum = 0;
		
		for(int i=0;i<size;i++)
		{ 
			int n = in.nextInt();
			if(n!=0)
			{
				sum += n;
				if(sum < n)
					sum = n;	
			}	
			else
			{
				sum=0;
			}
			
			if(maxsum < sum)
				maxsum = sum;
			
			if(sum==0)
			System.out.println(" max = "+ maxsum+ " sum = "+sum);

			arr[i] = n;
		}
		System.out.println(maxsum);
		in.close();
	}
	
}
