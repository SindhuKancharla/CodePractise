package maths;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {

		int n = 10;
		
		int c = 0;
		for(int i=5;i<= n;i=i*5)
		{
			c += n/i;
		}
		System.out.println(c);
	}

}
