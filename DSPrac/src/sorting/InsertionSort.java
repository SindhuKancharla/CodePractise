package sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = new int[]{5,8,1,4,3,2,9,6,7,0};
		
		insertionSort(arr);
		
		for(int i : arr)
			System.out.print(i + " ");
	}

	private static void insertionSort(int[] arr) {

		int n = arr.length;
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i] < arr[j])
				{
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

}
