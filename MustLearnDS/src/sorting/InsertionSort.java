package sorting;

public class InsertionSort {

	public static void main(String[] args)
	{
		int[] arr = new int[]{9,7,3,5,1,6,10};
		
		insertionSort(arr);
		
		for(int i : arr)
			System.out.print(i+" ");
		
		System.out.println();
	}
	
	public static void insertionSort(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j] > arr[i]){
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
	}
}
