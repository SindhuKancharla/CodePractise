package arrays;

public class RemoveDupsFromArray {

	public static void main(String[] args) {

		int[] arr = new int[]{1,2,2,3,4,5,5,6,6,7,8};
		
		int nl = removeDups(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeDups(int[] arr) {

		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!= arr[j])
			{
				arr[++i] = arr[j];
			}
		}
		return i+1;
	}

}
