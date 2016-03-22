package arrays;

public class RemoveDupsFromArray {

	public static void main(String[] args) {

		int[] arr = new int[]{1,1,2,2,3,3,4,5,5,6};
		
		int newlength = removeDups(arr);
		System.out.println(newlength);
		for(int i : arr)
			System.out.print(i+" ");
	}

	private static int removeDups(int[] arr) {

		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				arr[++i] = arr[j];
			}
		}
		return i+1;
	}

}
