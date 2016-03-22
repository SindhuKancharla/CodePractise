package sorting;

public class MergeSort {

	public static void main(String[] args)
	{
		int[] arr = new int[]{9,7,3,5,1,6,10};
		
		mergeSort(arr);
		
		for(int i : arr)
			System.out.print(i+" ");
		
		System.out.println();
	}

	private static void mergeSort(int[] arr) {

		int len = arr.length;

		if(len<2)
			return;
		
		int mid = len/2;
		
		int[] a = new int[mid];
		int[] b = new int[len-mid];
		
		for(int i=0;i<mid;i++)
		{
			a[i] = arr[i];
		}
		
		for(int j=mid,i=0;j<len;j++,i++)
		{
			b[i] = arr[j];
		}
		
		mergeSort(a);
		mergeSort(b);
		merge(arr,a,b);
	}

	private static void merge(int[] arr, int[] a, int[] b) {

		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length){
			
			if(a[i]>b[j])
			{
				arr[k] = b[j];
				j++;
				k++;
			}
			else{
				arr[k] = a[i];
				k++;
				i++;
			}
		}
		for(;i<a.length;i++)
		{
			arr[k] = a[i];
			k++;
		}
		
		for(;j<b.length;j++)
		{
			arr[k] = b[j];
			k++;
		}
		
	}
}
