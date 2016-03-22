package maths;

public class ReverseInteger {

	public static void main(String[] args) {

		int x = 12;
		int rev = 0;
		
		while(x!=0){
			
			rev = (rev*10) + x%10;
			x = x/10;
		}
		System.out.println(rev);
	}

}
