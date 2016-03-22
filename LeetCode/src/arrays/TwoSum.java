package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		int k = 8;
		
		int[] result = getPairs(arr,k);
		for(int i : result)
		{
			System.out.println(i+ " -: "+ arr[i]);
		}
	}

	private static int[] getPairs(int[] arr, int k) {


		int[] result = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				result[0] = map.get(arr[i]);
				result[1] = i;
			}
			else{
				map.put(k-arr[i], i);
			}
			
//			for(int j : result)
//			{
//				System.out.println(j+ " : "+ arr[j]);
//			}
		}
		return result;
	}

}
