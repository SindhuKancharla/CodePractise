package sorting;

public class AllSOrts {

	public static void main(String[] args) {

		int[] arr = new int[]{5,3,7,1,8,9,2,4,6,0};
		
		//insertionSort(arr);
		//mergeSort(arr);
		//quickSort(arr,0,arr.length-1);
		//display(arr);
		
		int[] out = new int[arr.length];
		countingSort(arr,out,10);
		display(out);
	}

	private static void countingSort(int[] arr, int[] out, int k) {

		int[] C = new int[k];
		for(int i=0;i<k;i++)
			C[i] = 0;
		
		for(int j=0;j<arr.length;j++)
		{
			C[arr[j]] = C[arr[j]] + 1;
		}
		
		for(int i=1;i<k;i++)
		{
			C[i] = C[i-1] + C[i];
		}
		
		for(int j=arr.length-1;j>=0;j--)
		{
			out[C[arr[j]]] = arr[j];
			C[arr[j]]--;
		}
	}

	private static void quickSort(int[] arr,int start,int end) {
		
		if(start<end)
		{
			int pivot = partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pivotIndex = start;
		
		for(int i=start;i<end;i++)
		{
			if(arr[i]<pivot)
			{
				swap(arr,i,pivotIndex);
				pivotIndex++;
			}
		}
		swap(arr,pivotIndex,end);
		return pivotIndex;
	}

	private static void mergeSort(int[] arr) {

		int n = arr.length;
		int mid = n/2;
		
		if(n<2)
			return;
		
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(int i=0;i<mid;i++)
		{
			left[i] = arr[i];
		}
		for(int i=mid;i<n;i++)
		{
			right[i-mid] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(arr,left,right);
	}

	private static void merge(int[] arr, int[] left, int[] right) {

		int i=0,ll=left.length,rl=right.length;
		int j=0,k=0;
		while(j<ll && k<rl)
		{
			if(left[j]<right[k])
			{
				arr[i] = left[j];
				i++;
				j++;
			}
			else
			{
				arr[i] = right[k];
				i++;
				k++;
			}
		}
		
		while(j<ll)
		{
			arr[i] = left[j];
			i++;
			j++;
		}
		
		while(k<rl)
		{
			arr[i] = right[k];
			i++;
			k++;	
		}
		display(arr);
	}

	private static void insertionSort(int[] arr) {
		
		int len = arr.length;
		
		for(int i=1;i<len;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]>arr[i])
				{
					swap(arr,i,j);
				}
			}
		}
		display(arr);
	}
	
	private static void display(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	private static void swap(int[] arr,int x,int y)
	{
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}

}
