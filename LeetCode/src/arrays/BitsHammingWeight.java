package arrays;

public class BitsHammingWeight {

	public static void main(String[] args) {

		long n = Long.valueOf("64");
		
		int i;
		for(i = 0 ;i< 32;i++)
		{
			int x = (int) Math.pow(2, i);
			if(x > n)
				break;
		}
		//i--;
		System.out.println(i);
		int[] bits = new int[33];
		
		for(int j = i; j>=0 && n > 0;j--)
		{
			int x = (int) Math.pow(2, j);
			n = n - x;
			System.out.println(n);
			if(n>=0)
				bits[32-j] = 1;
			else{
				n = n+x;
				bits[32-j] = 0;
			}
		}
		int count=0;
		
		for(int b : bits)
		{
			System.out.print(b);
			if(b==1)
				count++;
		}
		System.out.println("\n"+count);
	}

}
