package sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = new int[]{5,8,1,4,3,2,9,6,7,0};
		
		quickSort(arr,0,arr.length-1);
		
		for(int i :arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static void quickSort(int[] arr, int start, int end) {

		if(start < end)
		{
			int pivot = partition(arr,start,end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pivotIndex = start;
		
		for(int i=start;i<end;i++){
			
			if(arr[i]< pivot)
			{
				int tmp = arr[pivotIndex];
				arr[pivotIndex] = arr[i];
				arr[i] = tmp;
				pivotIndex++;
			}
		}
		
		int tmp = arr[pivotIndex];
		arr[pivotIndex] = pivot;
		arr[end] = tmp;

		return pivotIndex;
	}

}
