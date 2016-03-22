package maths;

import java.math.BigInteger;
import java.util.Scanner;

public class IsFibo {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();
		
		for(int i=0;i<n;i++){
			int k = in.nextInt();
			
			if(isFibonacci(k))
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo");
			
		}
		
		in.close();
	}

	private static boolean isFibonacci(int k) {

		BigInteger fsq = BigInteger.valueOf(k*k);
		fsq = fsq.multiply(BigInteger.valueOf(5));
		BigInteger sq = fsq.add(BigInteger.valueOf(4));
		
		BigInteger nsq = fsq.subtract(BigInteger.valueOf(4));
		
		BigInteger sqrt = sqrt(sq,BigInteger.valueOf(1));
		BigInteger nsqrt = sqrt(nsq,BigInteger.valueOf(1));
		

		if(sqrt.multiply(sqrt).equals(sq) || nsqrt.multiply(nsqrt).equals(nsq))
			return true;
		else
			return false;
	}

	private static BigInteger sqrt(BigInteger n, BigInteger x0)
	{
	    final BigInteger x1 = n.divide(x0).add(x0).shiftRight(1);
	    return x0.equals(x1)||x0.equals(x1.subtract(BigInteger.ONE)) ? x0 : sqrt(n, x1);
	}
}
