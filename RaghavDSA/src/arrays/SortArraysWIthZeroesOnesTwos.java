package arrays;

public class SortArraysWIthZeroesOnesTwos {

	public static void main(String[] args){
		
		int[] arr = new int[]{1,2,0,1,0,2,0,0,1,1};
		int len = arr.length;

		
		int start = 0;
		int end = len-1;
		int tmp;
		for(int i=0;i<=end;i++){
			if(arr[i]==0){
				tmp = arr[start];
				arr[start] = arr[i];
				arr[i] = tmp;
				start++;
			}
			
			else if(arr[i]==2){
				tmp = arr[end];
				arr[end] = arr[i];
				arr[i] = tmp;
				end--;
			}
		}
		
		for(int i : arr)
			System.out.print(i+ " ");
	}
}
