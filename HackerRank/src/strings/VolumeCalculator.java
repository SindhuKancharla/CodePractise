package strings;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.Permission;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class Calculate{

	Output output = new Output();

	Scanner sc = new Scanner(System.in);
	
	
	int getINTVal(){
		int x = sc.nextInt();
		return x;
	}
	
	double getDoubleVal(){
		double x = sc.nextDouble();
		return x;
	}		
	
	static Volume get_Vol(){
	
		Volume vol = new Volume();
		return vol;
	}
}

class Output{
	
	public void display  (double vol) throws IOException{
		if(vol>0){
			
			System.out.printf("%.3f",vol);
			System.out.println();
		}	else
			System.out.println("java.lang.NumberFormatException: All the values must be positive");
		
	}
}
class Volume{

	public double main(int a){
		return a*a*a;
	}
	
	public double main(int l,int b,int h){
		return l*b*h;
	}
	
	public double main(double r)
	{
		
		return Math.PI * r *r*r* 2/3.000;
	}
	
	public double main(double r,double h)
	{
		return Math.PI*r*r*h;
	}
}
public class VolumeCalculator {
		
		public static void main(String[] args) {
			Do_Not_Terminate.forbidExit();		
			try{
				Calculate cal=new Calculate();
				int T=cal.getINTVal();
				while(T-->0){
					double volume = 0.0d;		

					int ch=cal.getINTVal();			
					if(ch==1){
					
						int a=cal.getINTVal();
						volume=Calculate.get_Vol().main(a);
						
						
					}
					else if(ch==2){
					
						int l=cal.getINTVal();
						int b=cal.getINTVal();
						int h=cal.getINTVal();
						volume=Calculate.get_Vol().main(l,b,h);
						
					}
					else if(ch==3){
					
						double r=cal.getDoubleVal();
						volume=Calculate.get_Vol().main(r);
						
					}
					else if(ch==4){
					
						double r=cal.getDoubleVal();
						double h=cal.getDoubleVal();
						volume=Calculate.get_Vol().main(r,h);
						
					}

					System.out.println(volume);
					cal.output.display(volume);
				}
						
			}
			catch (NumberFormatException e) {
				System.out.print(e);
			} catch (Do_Not_Terminate.ExitTrappedException e) {
				System.out.println("Unsuccessful Termination!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
	}
}
	/**
	 *This class prevents the user from using System.exit(0)
	 * from terminating the program abnormally.
	 */
	class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}//end of Do_Not_Terminate	