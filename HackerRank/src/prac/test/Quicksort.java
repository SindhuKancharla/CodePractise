package prac.test;

import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		sort(arr,0,n-1);
		print(arr);

		sc.close();
	}

	private static void sort(int[] arr, int start, int end) {

		if(start>=end)
			return; 
		int p = partition(arr,start,end);
		sort(arr,start,p-1);
		sort(arr,p+1,end);
	}

	private static int partition(int[] arr, int start, int end) {
 
		int pivot = arr[end];
		
		int pivotindex = start;
		
		for(int i=start;i<end;i++){
			if(arr[i] < pivot){
				int tmp = arr[pivotindex];
				arr[pivotindex] = arr[i];
				arr[i] = tmp;
				pivotindex++;
			}
		}
		int tmp = arr[pivotindex];
		arr[pivotindex] = pivot;
		arr[end] = tmp;
		return pivotindex;
	}
	
	public static void print(int[] ar){
		for(int i : ar)
			System.out.print(i+" ");
		
		System.out.println();
	}
}
