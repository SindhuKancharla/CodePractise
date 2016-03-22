package maths;

public class PowerOf2and3 {

	public static void main(String[] args) {

		int x = 256;
		System.out.println(powerOf2(x));
		
		System.out.println(powerOf3(243));
	}

	private static boolean powerOf2(int y) {
		
		if((y & (y-1)) == 0)
			return true;
		else
			return false;
	}
	
	private static boolean powerOf3(int x)
	{
		double y = Math.log(x);
		double con = Math.log(3);
		
		double diff = Math.round(y/con);
		if(Math.pow(3,diff)==x)
			return true;
		else
			return false;
	}

}
