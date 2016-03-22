package maths;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 53435;
		
		System.out.println(checkPalindrome(num));
	}

	private static boolean checkPalindrome(int num) {

		
		int rev = reverse(num);
		
		if(rev==num)
			return true;
		
		return false;
	}

	private static int reverse(int num)
	{
		int rev = 0;
		
		while(num!=0)
		{
			rev = (rev*10) + num%10;
			num = num/10;
		}
		return rev;
	}
}
