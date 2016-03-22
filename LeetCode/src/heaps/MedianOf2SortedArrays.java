package heaps;

public class MedianOf2SortedArrays {

	public static void main(String[] args) {

		int[] nums1 = new int[]{1,3,5,7,9};
		int[] nums2 = new int[]{2,4,6,8,10};
	
		int m = nums1.length;
		int n = nums2.length;
		int mid = (m+n)/2;
		
		
		int median = median(nums1,nums2, mid, 0, m - 1,0, n -1);
		
		int medi = merge(nums1,nums2);
		System.out.println(medi + " "+median);
	}

	private static int merge(int[] nums1,int []nums2)
	{
		int l1 = nums1.length;
		int l2 = nums2.length;
		int[] nums3 = new int[l1+l2];
		int i=0,j=0,k=0;
		
		while(i<l1 && j<l2)
		{
			if(nums1[i] > nums2[j])
			{
				nums3[k] = nums2[j];
				k++;
				j++;
			}
			else{
				nums3[k] = nums1[i];
				k++;
				i++;
			}
		}
		
		while(i<l1)
		{
			nums3[k] = nums1[i];
			k++;
			i++;
		}
		
		while(j < l2)
		{
			nums3[k] = nums2[j];
			k++;
			j++;
		}
		
		int mid = nums3.length/2;
		int medi=0;
		if(nums3.length%2 == 0)
		{
			//System.out.println("mid = "+mid);
			medi = (nums3[mid] + nums3[mid-1])/2;
		}
		
		else{
			medi = nums3[mid];
		}
		return medi;
	}
	
	public static int median(int A[], int B[], int k, 
			int aStart, int aEnd, int bStart, int bEnd) {
		 
			int aLen = aEnd - aStart + 1;
			int bLen = bEnd - bStart + 1;
		 
			if (aLen == 0)
				return B[bStart + k];
			if (bLen == 0)
				return A[aStart + k];
			if (k == 0)
				return A[aStart] < B[bStart] ? A[aStart] : B[bStart];
		 
			int aMid = aLen * k / (aLen + bLen); // a's middle count
			int bMid = k - aMid - 1; // b's middle count
		 
			// make aMid and bMid to be array index
			aMid = aMid + aStart;
			bMid = bMid + bStart;
		 
			if (A[aMid] > B[bMid]) {
				k = k - (bMid - bStart + 1);
				aEnd = aMid;
				bStart = bMid + 1;
			} else {
				k = k - (aMid - aStart + 1);
				bEnd = bMid;
				aStart = aMid + 1;
			}
		 
			return median(A, B, k, aStart, aEnd, bStart, bEnd);
		}

}
