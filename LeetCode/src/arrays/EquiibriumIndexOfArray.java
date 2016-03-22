package arrays;

public class EquiibriumIndexOfArray {

	public static void main(String[] args) {

		int[] arr = {-7,1,5,2,-4,3,0};
//		System.out.println(getEquiindex(arr));
		System.out.println(getEquiindexBetter(arr));

	}

	private static int getEquiindexBetter(int[] arr) {

		int sum = 0;
		for(int i : arr)
			sum += i;
		
		int leftsum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum -= arr[i];
			
			if(leftsum == sum)
			{
				System.out.println(" btr "+arr[i]);
				return arr[i];
			}
			
			leftsum += arr[i];
		}
		return -1;
	}

	private static int getEquiindex(int[] arr) {

		int leftsum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			int rightsum = 0;

			leftsum += arr[i];
			for(int j = i+2;j<arr.length;j++)
			{
				rightsum += arr[j];
				
				if(leftsum == rightsum)
				{
					System.out.println(arr[i+1]);
					return arr[i+1];
				}
			}
			//System.out.println(leftsum + " "+rightsum);
		}
		return -1;
	}

}
