package arrays;

public class QuickSelect {

	public static void main(String[] args) {

		int[] array = new int[]{1, 8, 4, 5, 9, 7, 2, 10, 44, 55, 67};
		
		int k = 5;
		System.out.println(quickSelect(array,0,array.length-1,k-1));

		
		quickSort(array,0,array.length-1);
		display(array);
	}

	private static void quickSort(int[] array, int first, int last) {

		if(first<last){
			int pivot = partition(array,first,last);
			quickSort(array,first,pivot-1);
			quickSort(array, pivot+1, last);
		}
	}

	private static int quickSelect(int[] arr, int first,int last,int k) {
		
		int pivotIndex = partition(arr,first,last);
		//System.out.println(pivotIndex);
		if(k<pivotIndex)
		{
			return quickSelect(arr, first, pivotIndex-1, k);
		}
		else if(k>pivotIndex)
		{
			return quickSelect(arr, pivotIndex+1, last, k);
		}
		else
		{
			display(arr);
			return arr[pivotIndex];
		}
		
	}

	private static void display(int[] arr) {

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	private static int partition(int[] arr, int first, int last) {

		int pivot = arr[last];
		int pivotIndex = first;
		
		for(int i=first;i<=last;i++)
		{
			if(arr[i] > pivot)
			{
				int tmp= arr[pivotIndex];
				arr[pivotIndex] = arr[i];
				arr[i] = tmp;
				pivotIndex++;
			}
		}
		
		int tmp = arr[pivotIndex];
		arr[pivotIndex] = pivot;
		arr[last] = tmp;
		//System.out.println("pi = "+pivotIndex + " pivot = "+pivot);
		return pivotIndex;
	}

}
