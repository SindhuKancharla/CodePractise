package prac.sort;

import java.util.Scanner;

public class MergeSort extends SortingTechniques {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		mergeSort(arr);

		display(arr);
		in.close();

	}

	private static void mergeSort(int[] arr) {

		int len = arr.length;
		if (len < 2)
			return;

		int mid = len / 2;
		
		int[] left = new int[mid];
		int[] right = new int[len-mid];
		
		for(int i=0;i<mid;i++)
			left[i] = arr[i];
		
		for(int j=mid;j<len;j++)
			right[j-mid] = arr[j];
		
		mergeSort(left);
		mergeSort(right);
		merge(arr,left,right);

	}

	private static void merge(int[] arr, int[] left, int[] right) {

		int i = 0,j = 0,k=0;

		int leftl = left.length;
		int rightl = right.length;
		
		while(i< leftl && j<rightl)
		{
			if(left[i] <= right[j])
			{
				arr[k] = left[i];
				k++;
				i++;
			}
			else{
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		
		while(i <leftl)
		{
			arr[k] = left[i];
			k++;
			i++;
		}
		
		while(j< rightl)
		{
			arr[k] = right[j];
			k++;
			j++;
		}
	}
	
}
