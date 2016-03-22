package arrays;

public class RemoveNumFromArray {

	public static void main(String[] args) {

		int[] arr = new int[]{1};
		
		int nl = remove(arr,1);
		System.out.println(nl);
	}

	private static int remove(int[] arr, int i) {

		int pi = 0;
		
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]==i)
			{
				
			}
			else{
				if(pi!=k)
				{
					int tmp = arr[pi];
					arr[pi] = arr[k];
					arr[k] = tmp;
				}
				pi++;
			}
		}
		
		return pi;
		
	}

}
