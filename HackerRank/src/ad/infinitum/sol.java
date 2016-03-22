package ad.infinitum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sol {
    
/*
 * Complete the function below.
 */

    static int[] DistinctRegions(int[] nvalues) {

        int len = nvalues.length;
        BigInteger max = BigInteger.valueOf((long)Math.pow(10, 9));
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            
            int n  = nvalues[i];
            BigInteger b = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n));
            BigInteger tmp = b.add(BigInteger.valueOf(n));
            tmp = tmp.add(BigInteger.valueOf(2));
            tmp = tmp.divide(BigInteger.valueOf(2));
           
            System.out.println(tmp);
            int res = tmp.compareTo(max);
            System.out.println(res);
            if(res!= -1){
            	long x = tmp.longValue() % max.longValue();
            	output[i] = (int)x;
            }
            else
                output[i] = tmp.intValue();
        }
        return output;

    }
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
       
        int[] res;
        
        int _nvalues_size = 0;
        _nvalues_size = Integer.parseInt(in.nextLine());
        int[] _nvalues = new int[_nvalues_size];
        int _nvalues_item;
        for(int _nvalues_i = 0; _nvalues_i < _nvalues_size; _nvalues_i++) {
            _nvalues_item = Integer.parseInt(in.nextLine());
            _nvalues[_nvalues_i] = _nvalues_item;
        }
        
        res = DistinctRegions(_nvalues);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(res[res_i]);
        }
        
    }
}

