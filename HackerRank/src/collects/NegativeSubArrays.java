package collects;

import java.util.Scanner;

public class NegativeSubArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int c = countNegSubArrays(arr);
		System.out.println(c);
		sc.close();
	}

	private static int countNegSubArrays(int[] arr) {

		int n = arr.length;
		
		int sub_sum = 0;
		int count = 0;
		
		for(int i=0;i<n;i++)
		{
			sub_sum = 0;
			for(int j=i;j<n;j++)
			{
				sub_sum += arr[j];
				if(sub_sum<0)
				{
					count++;
					//System.out.println("["+i+":"+j+"]");
				}
			}
		}
		return count;
	}

}
