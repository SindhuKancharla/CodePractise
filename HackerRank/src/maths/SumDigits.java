package maths;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int s = sum(num);
		while(s>=10)
		{
			s = sum(s);
		}
		System.out.println(s);
		
		System.out.println(digitalSum(num));
		sc.close();
	}
	
	private static int sum(int num)
	{
		int sum =0;
		while(num !=0 )
		{
			sum += num%10;
			num = num/10;
		}

		return sum;
	}
	
	private static int digitalSum(int n)
	{
		return (int) (n-9*Math.floor((n-1)/9));
	}
}
