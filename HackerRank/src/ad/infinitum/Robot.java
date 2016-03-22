package ad.infinitum;

import java.io.IOException;
import java.util.Scanner;

public class Robot {

	/*
	 * Complete the function below.
	 */


	// Function to compute the new pos (x, y, dir) after completing one iteration of the string.
	// It will also update the max radius.
	static String findNewPos(String str, String cmd) {
	    int i, len, x, y; 
	    
	    String[] parts = cmd.split(",");
	    
	    char dir = cmd.charAt(0);
	    x = Integer.valueOf(parts[1]);
	    y = Integer.valueOf(parts[2]);
	    System.out.println(" dir = "+dir + " x = "+x + " y= "+y);

	    len = str.length();
	    i=0;

	    //Iterate through each character
	    while(i < len) {
	        char c = str.charAt(i);

	        switch(c) {
	            case 'L': // Turn left
	                switch(dir) {
	                  case 'N':
	                     x--;
	                     dir = 'W';
	                     break;
	                  case 'S':
	                     x++;
	                     dir = 'E';
	                     break;
	                  case 'E':
	                     y++;
	                     dir = 'N';
	                     break;
	                  case 'W':
	                     y--;
	                     dir = 'S';
	                     break;
	                  }
	                  break;

	                case 'R': // Turn right
	                  switch(dir) {
	                  case 'N':
	                     x++;
	                     dir = 'E';
	                     break;
	                  case 'S':
	                     x--;
	                     dir = 'W';
	                     break;
	                  case 'E':
	                     y--;
	                     dir = 'S';
	                     break;
	                  case 'W':
	                     y++;
	                     dir = 'N';
	                     break;
	                  }
	                  break;

	                case 'G': // Go forward
	                  switch(dir) {
	                  case 'N':
	                     y++;
	                     dir = 'N';
	                     break;
	                  case 'S':
	                     y--;
	                     dir = 'S';
	                     break;
	                  case 'E':
	                     x++;
	                     dir = 'E';
	                     break;
	                  case 'W':
	                     x--;
	                     dir = 'W';
	                     break;
	                  }
	                  break;
	                }

	             
	                i++;
	        }
        
	    	System.out.println("After first move in func , dir = " + dir + "  and x,y = "+x  + " , "+ y);

	    	String out = dir+","+x+","+y;
	    	return out;
	    }

	    static String doesCircleExist(String commands) {

	          String res = "";
	          int x=0, y=0;
	          char dir='N';
	   
	          String s = dir + ","+x+","+y;
	          
	          s = findNewPos(commands,s);
	          String[] parts = s.split(",");
	           dir = s.charAt(0);
	  	    x = Integer.valueOf(parts[1]);
	  	    y = Integer.valueOf(parts[2]);
	  	    
	          System.out.println("After first move , dir = " + dir + "  and x,y = "+x  + " , "+ y);
	          s = findNewPos(commands,s);
	          
	          dir = s.charAt(0);
		  	    x = Integer.valueOf(parts[1]);
		  	    y = Integer.valueOf(parts[2]);
		  	    
	          System.out.println("After second move , dir = " + dir + "  and x,y = "+x  + " , "+ y);

	          s = findNewPos(commands, s);
	          
	          dir = s.charAt(0);
		  	    x = Integer.valueOf(parts[1]);
		  	    y = Integer.valueOf(parts[2]);
		  	    
	          System.out.println("After third move , dir = " + dir + "  and x,y = "+x  + " , "+ y);

	          s = findNewPos(commands, s);
	          
	          dir = s.charAt(0);
		  	    x = Integer.valueOf(parts[1]);
		  	    y = Integer.valueOf(parts[2]);
		  	    
	          System.out.println("After fourth move , dir = " + dir + "  and x,y = "+x  + " , "+ y);

	          parts = s.split(",");

	          dir = s.charAt(0);
		  	    x = Integer.valueOf(parts[1]);
		  	    y = Integer.valueOf(parts[2]);
		  	    
	          // Are we back to position where we were after 1st iteration?
	         // if(x == refx && y == refy) {
	          if(dir=='N'){
	            res = "YES";
	          }
	          else {
	            res = "NO";
	          }

	          return res;
	    }


	    public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        
	        String res;
	        String _commands;
	        try {
	            _commands = in.nextLine();
	        } catch (Exception e) {
	            _commands = null;
	        }
	        
	        res = doesCircleExist(_commands);
	       System.out.println(res);
	    }
}
