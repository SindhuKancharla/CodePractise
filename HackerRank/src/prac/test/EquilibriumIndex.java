package prac.test;

public class EquilibriumIndex {

	public static void main(String[] args)
	{
		int[] arr = new int[]{-1,3,-4,5,1,-6,2,1};
		
		int len = arr.length;
				
		int index = getIndex(arr,len);
		System.out.println(index);
	}

	private static int getIndex(int[] arr, int len) {

		int index = -1;
		int end = len-1;
		for(int i=0;i<len;i++){
			int tmp =i;
			int tmpsum = getSum(arr,0,tmp);
			int remsum = getSum(arr, tmp+2, end);
			
			//System.out.println("i = "+i+" tmpsum = "+tmpsum + " remsum = "+remsum);
			if(tmpsum==remsum)
			{
				index = i+1;
				break;
				//System.out.println(index);
			}
			
		}
		return index;
	}
	
	private static int getSum(int[]arr,int start,int end){
		
		int sum = 0;
		//System.out.println("start = "+start + " end = "+end);
		for(int i=start;i<=end;i++){
			
			sum += arr[i];
		}
		return sum;
	}
}
