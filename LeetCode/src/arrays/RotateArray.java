package arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = {1,2};
		
		rotate(arr,1);
		
		display(arr);
	}

	private static void display(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void rotate(int[] arr,int k) {

		reverse(arr,0,k);
		display(arr);

		reverse(arr,k+1,arr.length-1);
		display(arr);

		reverse(arr,0,arr.length-1);
		display(arr);

	}

	private static void reverse(int[] arr, int start, int end)
	{
		for(int i=start,j=end;i<j;)
		{
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
	}
}
