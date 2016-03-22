package sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = new int[]{5,8,1,4,3,2,9,6,7,0};
		
		mergeSort(arr);
		
		display(arr);
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
		
		for(int j=mid;j<len;j++)
		{
			b[j-mid] = arr[j];
		}
		
		mergeSort(a);
		mergeSort(b);
		
		merge(arr,a,b);
		
	}

	private static void display(int[] a){
		
		for(int i :a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	private static void merge(int[] c,int[] a, int[] b) {

		int al = a.length;
		int bl = b.length;
				
		int i=0,j=0,k=0;
		while(i<al && j<bl){
			
			if(a[i] < b[j])
			{
				c[k] = a[i];
				k++;
				i++;
			}
			else{
				c[k] = b[j];
				k++;
				j++;
			}
		}
		
		while(i<al)
		{
			c[k] = a[i];
			k++;
			i++;
		}
		
		while(j<bl)
		{
			c[k] = b[j];
			k++;
			j++;
		}
	}
}
