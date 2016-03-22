package arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {

		final int[] nums1 = new int[9];
		nums1[0] = 1;
		nums1[1] = 3;
		nums1[2] = 5;
		nums1[3] = 7;
		nums1[4] = 9;
		
//		Map<Integer,Integer> map = new TreeMap<>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return 0;
//			}
//		});
//		map.put(2, 1);
//		map.put(1, 4);
//		map.put(7, 3);
//		map.put(4, 5);
//		map.put(9, 2);
//		
//		for(Entry<Integer,Integer> en : map.entrySet())
//			System.out.println(en.getKey() + " " +en.getValue());
//		Set<Integer> set = new TreeSet<>();
//		set.add(1);
//		set.add(3);
//		set.add(2);
//		set.add(4);
//		set.add(5);
//		set.add(3);
//
//		for(int i : set)
//			System.out.print(i+ " ");
//		System.out.println();
		int[] nums2 = {2,4,6,8};
		
		merge(nums1,5,nums2,nums2.length);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i= m-1 ,j= n-1, k = m+n-1;
        for(; i >= 0 && j >= 0 ;)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        while(i>=0)
        {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        
        while(j>=0)
        {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
        
        for(int in : nums1)
        {
        	System.out.print(in + " ");
        }
    }

}
