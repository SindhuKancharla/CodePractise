package arrays;

public class RearrangeArraysMinMax {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] ret = rearrange(arr);
		
		display(ret);
		
		rearrangeBetter(arr);
		
		display(arr);
	}

	private static void display(int[] arr)
	{
		for(int i : arr)
			System.out.print(i+ " ");
		System.out.println();
	}
	
	private static void rearrangeBetter(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int tmp = arr[i];
			
			while(tmp > 0)
			{
				int j = (i < arr.length/2) ? (2*i + 1) : (2 * ( arr.length-1-i) );
				
				if(i==j)
				{
					arr[j] = -tmp;
					break;
				}
				
				int x = tmp;
				tmp = arr[j];
				arr[j] = x;
				
				arr[j] = -arr[j];
				i = j;
			}
		}
		
		for(int i =0;i< arr.length;i++)
			arr[i] = -arr[i];
	}

	private static int[] rearrange(int[] arr) {

		int[] ret = new int[arr.length];
		int [] orig = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
			orig[i] = arr[i];
		
		reverse(arr);
		
		display(arr);
		display(orig);
		
		int j=0,k=0;
		
		for(int i = 0;i<orig.length;i++){
			if(i%2==0)
			{
				ret[i] = arr[j];
				j++;
			}
			else
			{
				ret[i] = orig[k];
				k++;
			}
		}
		return ret;
	}

	private static void reverse(int[] arr) {

		int len = arr.length-1;
		int j = len;
		for(int i =0;i<j;)
		{
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
	}

}
