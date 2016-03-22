package ad.infinitum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	public static void main(String[] args) throws IOException{
		        Scanner in = new Scanner(System.in);
		      
		     //   String[] res;
		        
		        int _transactions_size = 0;
		        _transactions_size = Integer.parseInt(in.nextLine());
		        String[] _transactions = new String[_transactions_size];
		        String _transactions_item;
		        for(int _transactions_i = 0; _transactions_i < _transactions_size; _transactions_i++) {
		            try {
		                _transactions_item = in.nextLine();
		            } catch (Exception e) {
		                _transactions_item = null;
		            }
		            _transactions[_transactions_i] = _transactions_item;
		        }
		        
		        int res = getMinTimeDifference(_transactions);
		        System.out.println(res);
		       // res = getSuspiciousList(_transactions);
		      //  for(int res_i=0; res_i < res.length; res_i++) {
		        //    System.out.println(String.valueOf(res[res_i]));
		        //}
		        
		        in.close();
		    }
		
	static int getMinTimeDifference(String[] times) {

		int min = 1000000;
		
		for(int i=0;i<times.length;i++){
			
			
			String[] parts = times[i].split(":");
			
			int hrs = Integer.valueOf(parts[0]);
			if(hrs==0)
				hrs=24;
			
			
			int mins = Integer.valueOf(parts[1]);
			
			for(int j=i+1;j<times.length;j++){
				
				System.out.println(times[i] + " and "+times[j]);
				String[] parts1 = times[j].split(":");
				
				int hrs1 = Integer.valueOf(parts1[0]);
				int mins1 = Integer.valueOf(parts1[1]);
				
				if(hrs1==0){
					if(Math.abs(hrs1-hrs)>12)
						hrs1=24;
					else
						hrs1=0;
				}
				int x = hrs1*60 + mins1;
				int  y = hrs*60 + mins;
				
				int diff = Math.abs(x-y);
				System.out.println(x + "  : " +y + " = "+diff);

				if(diff <min)
					min = diff;
				
			}
			
		}
		return min;

    }
	
    private static String[] getSuspiciousList(String[] transactions) {

    	Map<String,Integer> costName = new HashMap<>();
    	Map<String,String> locName = new HashMap<>();
    	Map<String,Integer> timeName = new HashMap<>();

    	Map<String,Integer> nameFirstTrantime = new HashMap<>();
    	List<String> lst = new ArrayList<>();
    	for(String tr : transactions)
    	{
    		String[] parts = tr.split("\\|");
    		
    		int cost = Integer.valueOf(parts[1]);
    		int time = Integer.valueOf(parts[3]);
    		String loc = parts[2];
    		String name = parts[0];
    		
    		if(!nameFirstTrantime.containsKey(name))
    			nameFirstTrantime.put(name, time);
    		if(cost>3000){
    			if(!lst.contains(name))
    			{
    				lst.add( name);
    				
    			}
    			locName.put(name, loc);
        		timeName.put(name, time);
        		
        		costName.put(name,cost);
    			continue;
    		}
    		
    		boolean chk = true;
    		if(locName.containsKey(name)){
    			String prevLoc = locName.get(name);
    			//System.out.println(name + " + " + prevLoc);
    			if(!prevLoc.equalsIgnoreCase(loc)){
    				int prevTime = timeName.get(name);
    				if(time-prevTime<60)
    				{
    					//System.out.println(loc + " - "+time + " - "+prevTime);
    					if(!lst.contains(name))
    	    			{
    						for(int i=0;i<lst.size();i++){
    							String nm = lst.get(i);
    							//System.out.println(" :::::: "+nm);
    							
    								int tm = nameFirstTrantime.get(nm);
    								//System.out.println(" ------ "+nm + " : "+tm);
    								if(prevTime < tm){
    									chk = false;
    									lst.add(i,name);
    			    					break;

    								}
    							//}

    						}
    						if(chk)
    							lst.add(name);
    						
    	    			}
    					
    				}
//    				else{
//    					System.out.println("loc diff but time ok");
//    					//continue;
//    				}
    				
    			}
//    			else
//    				System.out.println("Loc same");
    			
    		}
    		locName.put(name, loc);
    		timeName.put(name, time);
    		
    		costName.put(name,cost);
    		
    	}
    		
    	String[] list = new String[lst.size()];
    	int i=0;
    	for(String s : lst){
    		System.out.println("..."+s);
    		list[i++] = s;
    	}
    	
    	return list;
	}

	
	
	static int maxRounds(String s, String t) {

		int out = 0;
		
		while(s.contains(t)){
			out++;
			System.out.println(s);		

			s = s.replaceFirst(t, "");
			
			if(s.length()==0)
				break;
		}
		return out;

    }
}
