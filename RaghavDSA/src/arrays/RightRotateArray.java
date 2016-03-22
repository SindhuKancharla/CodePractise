package arrays;

public class RightRotateArray {

	public static void main(String[] args)
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8};
		
		int len = arr.length;
		int k=5;
		
		print(arr);
		
		for(int i=0;i<k;i++)
		{
			rotate(arr,len);
		}
		print(arr);
		
	}
	
	public static void rotate(int[] arr, int len)
	{
		int last = arr[len-1];
		for(int i=len-1;i>0;i--){
			
			arr[i] = arr[i-1];			
		}
		arr[0] = last;
		//print(arr);
	}
	
	public static void print(int[] arr){
		
		for(int i : arr)
			System.out.print(i+ " ");
		
		System.out.println();
	}
}
