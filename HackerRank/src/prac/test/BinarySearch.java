package prac.test;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
		
			arr[i] = sc.nextInt();
		}
		
		int pos = binarySearch(arr,0,arr.length-1,v);
		System.out.println(pos);
	}

	private static  int binarySearch(int[] arr, int start, int end,int v) {

		int mid = (start + end) /2;
		if(arr[mid] ==v)
				return mid;
		else if(arr[mid] > v)
			return binarySearch(arr, start,mid-1 , v);
		else
			return binarySearch(arr, mid+1, end, v);
		
	}
}
