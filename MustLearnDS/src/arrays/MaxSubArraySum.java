package arrays;

public class MaxSubArraySum {
	
	public static void main(String[] args){
		
		int[] arr = new int[]{2, -9, 5, 1, -4, 6, 0, -7, 8};
		int sum = maxSum(arr);
		System.out.println(sum);
	}

	private static int maxSum(int[] arr) {

		int max = 0;
		int tmpsum = arr[0];
		
		for(int i=1;i<arr.length;i++){
			
			tmpsum += arr[i];
			
			if(tmpsum<0)
				tmpsum = 0;
			if(max < tmpsum)
				max = tmpsum;
			
			System.out.println(tmpsum + " : "+max);
		}
		return max;
	}

}
