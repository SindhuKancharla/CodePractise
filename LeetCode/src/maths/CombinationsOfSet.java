package maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsOfSet {

	public static void main(String[] args) {

		int[] arr = new int[]{1,2,3};
		
		List<List<Integer>> lists = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			List<List<Integer>> tmp = new ArrayList<>();

			for(List<Integer> list : lists)
			{
				tmp.add(new ArrayList<>(list));
			}
			
			for(List<Integer> list : tmp)
			{
				list.add(arr[i]);
			}
			
			List<Integer> list = new ArrayList<>();
			list.add(arr[i]);
			
			tmp.add(list);
			lists.addAll(tmp);
		}
		
		lists.add(new ArrayList<>());
		
		for(List<Integer> list : lists)
		{
			for(int i : list)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
