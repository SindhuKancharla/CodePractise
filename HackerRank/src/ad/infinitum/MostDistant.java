package ad.infinitum;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MostDistant {

	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        
        List<Integer> xs = new ArrayList<>();
        List<Integer> ys = new ArrayList<>();
        List<Double> dist = new ArrayList<>();
        
        String max = "";
        
        for(int i=0;i<n;i++)
        {
        	int x = myScan.nextInt();
            int y = myScan.nextInt();
            
            if(y==0)
            	xs.add(x);
            else if(x==0)
            	ys.add(y);
  
        }
        
        Collections.sort(xs);
        Collections.sort(ys);
        
        NumberFormat formatter = new DecimalFormat("#0.000000");

        double xdist = Math.abs(xs.get(0) - xs.get(xs.size()-1));
        double ydist = Math.abs(ys.get(0) - ys.get(ys.size()-1));
       
        if(xdist > ydist)
        	max = formatter.format(xdist);
        else
        	max = formatter.format(ydist);
        
        System.out.println(max);
        dist.add(getDistance(xs.get(0), ys.get(0)));
        dist.add(getDistance(xs.get(0), ys.get(ys.size()-1)));
        dist.add(getDistance(xs.get(xs.size()-1), ys.get(0)));
        dist.add(getDistance(xs.get(xs.size()-1), ys.get(ys.size()-1)));

        Collections.sort(dist);
        
        double maxlist = dist.get(dist.size()-1);
        
        System.out.println(maxlist);
        
        if(Double.valueOf(max) < maxlist)
        	System.out.println(dist.get(dist.size()-1));
        else
        	System.out.println(max);
        
        myScan.close();
	}
	
	private static double getDistance(int x,int y){
		
		return Math.abs(Math.sqrt((x * x) +( y * y)));

		
	}
}
