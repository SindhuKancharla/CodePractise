package prac.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int out = 1;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            out=1;
            if(n==0)
                System.out.println(out);
            else{
            		
            	for(int i=0;i<n;i++)
            	{
                    if(i%2==1)
                    {
                          out += 1;  
                    }
                    else{
                    	out = out*2;
                    }
                    //System.out.println("i = "+i+" out = "+out);
                }
                System.out.println(out);
            }
        }
    }
}
