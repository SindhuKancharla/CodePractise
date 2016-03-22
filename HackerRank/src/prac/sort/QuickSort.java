package prac.sort;

import java.util.Scanner;

public class QuickSort extends SortingTechniques{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i] = in.nextInt();
		}

		quickSort(arr,0,size-1);
		
		display(arr);
		in.close();
	
	}

	private static void quickSort(int[] arr, int start, int end){
		
		if(start>= end)
			return;
		
		int p = partition(arr,start,end);
		quickSort(arr,start,p-1);
		quickSort(arr, p+1, end);
		
	}
	
	private static int partition(int[] arr, int start, int end) {

		int pivot_index = start;
		int pivot = arr[end];

		for(int i= start ; i< end ; i++)
		{
			if(arr[i] <= pivot)
			{
				SortingTechniques.swap(arr,i,pivot_index);
				pivot_index++;
			}
		}
		
		swap(arr,end,pivot_index);

		return pivot_index;
	}
}
