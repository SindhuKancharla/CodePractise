package prac.sort;

import java.util.Scanner;

public class SortingTechniques {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i] = in.nextInt();
		}

		insertion(arr);
//		selectionSort(arr);
//		bubbleSort(arr);
//		insertionSort(arr);
		
		display(arr);
		in.close();
	}

	private static void insertionSort(int[] arr) {
		/*
		 *  9 7 4 6 3
			7 9 4 6 3 
			4 7 9 6 3 
			4 6 7 9 3 
			3 4 6 7 9 
		 */
		int len = arr.length;

		for(int i=1;i<len;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j-1] > arr[j])
					swap(arr,j-1,j);
			}
			display(arr);
		}
	}

	private static void insertion(int[] arr){
		
		int len = arr.length;

		for(int i=1;i<len;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j] > arr[i])
					swap(arr,i,j);
			}
			display(arr);
		}
	}
	private static void bubbleSort(int[] arr) {

		/*
		 * 	9 7 4 6 3
			7 4 6 3 9 
			4 6 3 7 9 
			4 3 6 7 9 
			3 4 6 7 9 
		 */
		int len = arr.length;
		for(int i=len-1;i> 0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j] > arr[j+1])
					swap(arr,j,j+1);
			
			}
			display(arr);
		}
	}

	public static void bubble(int[] arr){
		
		for (int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
				}
				
			}
			display(arr);
		}
	}
	private static void selectionSort(int[] arr) {

		/*
		 * 	9 7 4 6 3
			3 7 4 6 9 
			3 4 7 6 9 
			3 4 6 7 9 
			3 4 6 7 9 
			3 4 6 7 9 
		 */
		int len = arr.length;		
		
		for(int i=0;i<len;i++)
		{
			int min = arr[i];
			int min_index = i;
			for(int j=i+1;j<len;j++)
			{
				if(arr[j] < min){
					min = arr[j];
					min_index = j;
				}
			}
			if(arr[i] > min)
				swap(arr,i,min_index);
			
			display(arr);
		}
	}

	protected static void swap(int[] arr, int i, int min_index) {

		int temp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = temp;
	}

	protected static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
