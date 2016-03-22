package prac.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		List<Long> list = new ArrayList<>();
		
		for(int i=0;i<size;i++)
		{
			long n = in.nextLong();
			list.add(n);
			
			char[] bits = get_bits_from_int(n);
			long out = get_int_from_bits(bits);
			System.out.println(out);
		}
	}

	private static long get_int_from_bits(char[] bits) {

		long out = 0;
		
		for(int i=31;i>=0;i--)
		{
			char c = bits[31-i];
			if(c=='1')
			{
				out += Math.pow(2, i);
				//System.out.println(i + " = "+Math.pow(2, i)+ " out = "+out);
			}
		}
		return out;
	}

	private static char[] get_bits_from_int(long n) {

		Map<Integer,Boolean> bits = new HashMap<>();
		char[] outarr = new char[32];
		for(int i=0;i<32;i++){
			outarr[i]='0';
		}
		int i=0;
		for(i=0;Math.pow(2, i)<=n;++i)
		{
			//System.out.println(Math.pow(2, i) + " , i = " + i);
		}
		i--;
		while(i>=0){
				//System.out.println("n = "+ n + " i = "+i);
				if(n - Math.pow(2, i)>=0){
					bits.put(i, true);
					n = (long) (n - Math.pow(2, i));
				}
				i--;
			
		}
		//System.out.println(" all 0 " +get_int_from_bits(outarr));

		for(Entry<Integer,Boolean> en : bits.entrySet())
		{
			//System.out.println(en.getKey()+ " : "+en.getValue());
			if(en.getValue())
			{
				outarr[31-en.getKey()]='1';
			}	
		}
		//String b = String.valueOf(outarr);

		//System.out.println(" before flipping " + b + " value = "+get_int_from_bits(outarr));
		for(int i1=0;i1<32;i1++){
			
			if(outarr[i1]=='0')
				outarr[i1]='1';
			else
				outarr[i1]='0';
		}
		//String s = String.valueOf(outarr);
		//System.out.println(s);
		return outarr;
	}	
}