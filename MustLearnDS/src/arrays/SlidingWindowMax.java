package arrays;

public class SlidingWindowMax {

	public static void main(String[] args) {

		int[] arr = new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k = 3;
		
		int len = arr.length;
		
		int max = arr[0];
		int cur = 0;
		for(int i=0,j=0;i<len;i++,j++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(j==k-1)
			{
				cur++;
				System.out.println(max);
				i = cur;
				j=0;
				max = arr[i];
			}
			
		}
	}

}
