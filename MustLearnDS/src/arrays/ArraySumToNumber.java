package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraySumToNumber {

	public static void main(String[] args) {

		int[] arr = new int[]{6,4,4,4,4,2};
		List<String> out = new ArrayList<>();
		
		int sum = 10;
		for(int i=0;i<arr.length;i++)
		{
			int y = sum-arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==y)
				{
					String s = String.valueOf(arr[i])+arr[j];
					if(!out.contains(s))
						out.add(s);
				}
			}
			
		}
		
		for(String s : out)
		{
			System.out.println(s);
		}
		
		sumPairs(arr,sum);
		System.out.println("-------list--------");
		sumPairs2(arr, sum);
		System.out.println("-------sort--------");
		sumPairs3(arr, sum);

		
		System.out.println("\n\n\n\n------map--------");
		sumPairs4(arr, sum);
	}
	
	public static void sumPairs(int[] arr, int sum){
		

		int[] a = new int[100];
		for(int x : arr)
		{
			a[x] = 1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int tmp = sum-arr[i];
			if(a[tmp]==1)
			{
				System.out.println(arr[i]+","+tmp);
			}
			else{
				a[arr[i]]=1;
			}
		}
	}

	public static void sumPairs2(int[] arr, int sum){

		Set<Integer> set= new HashSet<>();
		
		for(int i : arr)
		{
			int rem = sum-i;
			if(set.contains(rem))
			{
				System.out.println(i+","+rem);
			}
			else
				set.add(i);
		}
		
		
	}
	
	public static void sumPairs4(int[] arr,int sum)
	{
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : arr){
			if(map.containsKey(i))
			{
				int tmp = map.get(i);
				map.put(i, tmp+1);
			}
			else{
				map.put(i, 1);
			}
		}
		
		for(int x : arr)
		{
			int y = sum-x;
			if(map.containsKey(y) && map.get(y)>0)
			{
				System.out.println(x + " , "+ y);
				//int tmp = map.get(x);
				map.put(x, 0);
				
				//tmp = map.get(y);
				map.put(y, 0);
				
			}
		}
	}
	
	public static void sumPairs3(int[] arr, int sum)
	{
		Arrays.sort(arr);
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right)
		{
			if(arr[left] + arr[right]==sum)
			{
				System.out.println(arr[left]+ " ,"+arr[right]);
				left++;
				right--;
			}
			else if(arr[left]+arr[right]>sum)
			{
				right--;
			}
			else{
				left++;
			}
		}
	}
}
