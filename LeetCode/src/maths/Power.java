package maths;

public class Power {

	public static void main(String[] args) {

		int x = 3;
		int n = 3;
		
		System.out.println(power(x,n));
	}

	private static int power(int x, int n) {

		if(n==0)
			return 1;
		
		int v = power(x,n/2);
		
		if(n%2==0)
			return v*v;
		else
			return v*v*x;
		
	}

}
