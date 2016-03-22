package arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {

		int[] nums = new int[]{2, 0, 5, 0, 4, 0, 0, 1, 0, 3, 12};
		
		int zero_start = 0;
		
		for(int i =0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				int tmp = nums[i];
				nums[i] = 0;
				nums[zero_start] = tmp;
				zero_start++;
			}
		
		}
		for(int j : nums)
		{
			System.out.print(j+" ");
		}
		
		System.out.println();
		
	}

}
