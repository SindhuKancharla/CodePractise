package strings;

import java.util.Scanner;

public class NumberOf2s {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		findNumberOf2s(x,arr);
		System.out.println(x);
		sc.close();
		
		for(int i : arr)
			System.out.print(i+" ");
	}

	private static void findNumberOf2s(int x, int[] arr) {

		arr[3] = 4;
		arr[4] = 5;
		arr = null;
		x = 100;
		for(int y=0; y <x;y++)
		{
			String ys = String.valueOf(y);
			if(ys.contains("2"))
			{
				System.out.print(ys + " ");
			}
		}
		System.out.println();
	}

}
