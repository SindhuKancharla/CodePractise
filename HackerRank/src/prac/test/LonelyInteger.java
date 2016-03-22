package prac.test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
   static int lonelyinteger(int[] a) {
      
       int pred_sum = 0;
       int actual_sum = 0;
       boolean check = false;
       Set<Integer> set = new HashSet<Integer>();
       for(int i=0;i<a.length;i++)
       {
           if(!set.contains(a[i]))
           {
               check = true;
               set.add(a[i]);
               pred_sum += a[i]*2;
           }
           actual_sum += a[i];
       }
       if(set.contains(0) && !check)
           return 0;
       else
           return pred_sum-actual_sum;
   }
    
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
