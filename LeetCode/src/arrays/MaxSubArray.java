package arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {

	public static void main(String[] args) {

		int[] arr = new int[]{-2,5,-1,7,9,-8,-3};
		
		maxSubarray(arr);
		
	}

	private static void maxSubarray(int[] arr) {

		int maxSum = 0;
		int prevSum = 0;
		List<Integer> sub = new ArrayList<>();
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			prevSum = sum;
			sum += arr[i];
			
			System.out.println(prevSum + " " +sum);
			if(sum<0)
			{
				sum = 0;
			}
			
			if(prevSum>0)
				sub.add(arr[i-1]);
			
			if(maxSum < sum)
			{
				maxSum = sum;
			}
		}
		for(int i : sub)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("maxsum = "+maxSum);
	}

}
