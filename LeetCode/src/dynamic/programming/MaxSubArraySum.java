package dynamic.programming;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSum(arr));
		
		System.out.println(dpMaxSum(arr));

	}

	private static int maxSum(int[] arr) {

		int maxSum = 0;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			if(sum<0)
				sum = 0;
			
			if(sum>maxSum)
				maxSum = sum;
		}
		return maxSum;
	}
	
	private static int dpMaxSum(int[] arr)
	{
		int[] sum = new int[arr.length];
		sum[0] = arr[0];
		
		int maxSum = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			sum[i] = Math.max(arr[i], arr[i]+sum[i-1]);
			maxSum = Math.max(maxSum, sum[i]);
		}
		return maxSum;
		
	}

}
