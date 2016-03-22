package ad.infinitum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GetInversedNumber {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        res = getInversedNumber(_n);
        System.out.println(res);
        in.close();
    }

	private static int get_int_from_bits(char[] bits, int len) {

		int out = 0;
		len--;
		for(int i=len;i>=0;i--)
		{
			char c = bits[len-i];
			if(c=='1')
			{
				out += Math.pow(2, i);
				//System.out.println(i + " = "+Math.pow(2, i)+ " out = "+out);
			}
		}
		return out;
	}

	private static int getInversedNumber(int n) {

		Map<Integer,Boolean> bits = new HashMap<>();
		
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
					n =  (int) (n - Math.pow(2, i));
				}
				else{
					bits.put(i, false);
				}
				i--;
			
		}
		int len = bits.size();
		//System.out.println(len);
		char[] outarr = new char[len];

		for(int val : bits.keySet()){
			
			if(bits.get(val))
			{
				outarr[len-1-val]='1';
			}	
			else{
				outarr[len-1-val]='0';
			}
		}
//		for(Entry<Integer,Boolean> en : bits.entrySet())
//		{
//			//System.out.println(en.getKey()+ " : "+en.getValue());
//			if(en.getValue())
//			{
//				outarr[len-1-en.getKey()]='1';
//			}	
//			else{
//				outarr[len-1-en.getKey()]='0';
//			}
//		}
		///System.out.println(outarr);
		
		for(int i1=0;i1<len;i1++){
			
			if(outarr[i1]=='0')
				outarr[i1]='1';
			else
				outarr[i1]='0';
		}
		//System.out.println(outarr);
		
		int res = get_int_from_bits(outarr,len);
		//System.out.println(res);
		return res;
	}
}
