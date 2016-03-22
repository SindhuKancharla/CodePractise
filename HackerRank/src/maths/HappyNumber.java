package maths;

import java.util.Scanner;

public class HappyNumber {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int s = sumOfSquares(num);
		while(s!=1)
		{
			System.out.println(s);

			s = sumOfSquares(s);
			if(s==4)
			{
				System.out.println("Not happy number");
				return;
			}
		}
		System.out.println("HAPPY NUMBER");
		sc.close();
	}

	private static int sumOfSquares(int num) {

		int sum = 0;
		while(num !=0)
		{
			sum += (num%10) * (num%10);
			num = num/10;
		}
		return sum;
	}

}
