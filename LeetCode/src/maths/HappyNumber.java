package maths;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		
		int n = 20;
		
		while(!set.contains(n))
		{
			set.add(n);

			n = sumOfSquares(n);
			if(n==1)
			{
				System.out.println("TRUE");
				return;
			}
		}
		System.out.println("FALSE");
	}
	
	public static int sumOfSquares(int n)
	{
		int sum = 0;
		
		while(n!=0)
		{
			int rem = n%10;
			sum += rem * rem;
			n = n/10;
		}
		System.out.println(sum);
		return sum;
	}

}
