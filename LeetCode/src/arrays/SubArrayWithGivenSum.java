package arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int[] arr = new int[]{1,3,5,4,4,2,6,7,8};
				
		find(arr,8);
		findArrays(arr, 0,8);
	}

	private static void find(int[] arr, int sum) {

		int cur_sum = 0;
		int start = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			cur_sum += arr[i];

			while(cur_sum > sum)
			{
				cur_sum = cur_sum - arr[start];
				start++;
			}
			if(cur_sum==sum){
				System.out.println("cur_sum = "+cur_sum + " start = "+start + " and end = "+ (i));
			}
			
		}
	}
	
	private static void findArrays(int[] arr,int start ,int sum)
	{
		int cur_sum = arr[start];
		List<Integer> list = new ArrayList<>();
		for(int i= start ;i<arr.length;i++)
		{
			System.out.println("sum = "+sum + " cursum = "+cur_sum);
			if(cur_sum < sum)
			{
				list.add(arr[i]);
				findArrays(arr,i+1, sum-cur_sum);
			}
			else if(cur_sum==sum)
			{
				list.add(arr[i]);
				for(int j : list)
					System.out.print(j + " ");
				
				
				System.out.println();
				list.remove(list.size()-1);
				return;
			}
			else{
				cur_sum = arr[i];
			}
		}
	}
}
