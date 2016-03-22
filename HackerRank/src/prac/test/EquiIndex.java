package prac.test;

import java.util.HashMap;
import java.util.Map;

public class EquiIndex {

	public static void main(String[] args)
	{
		int[] arr = new int[]{1,2,3,4,2,1};
		
		int index = 0;
		int len = arr.length;
				
		int cumsum = 0;
		int leftsum = 0;
		for(int i=0;i<len;i++)
			cumsum += arr[i];
		
		for(int i=0;i<len;i++){
			
			int rightsum = cumsum - leftsum - arr[i];
			
			if(rightsum==leftsum)
				index = i;
			
			leftsum += arr[i];
		}
		//System.out.println(index);
		
		
		prefixset(arr);

	}
	
	public static void prefixset(int[] arr){
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i : arr){
			
			if(map.containsKey(i)){
				int cnt = map.get(i);
				map.put(i, ++cnt);
			}
			else
				map.put(i, 1);
		}
		
		for(int i=arr.length-1;i>0;i--){
			
			if(map.get(arr[i])==1){
				System.out.println(i);
				break;
			}
		}
		
	}
}
