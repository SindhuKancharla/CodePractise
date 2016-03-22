package sorting;

public class CountingSort {

	public static void  main(String[] args){
		
		int[] A = new int[]{4,3,5,2,7,10,1};
		
		int n = A.length;
		
		int[] B = new int[n+1];
		int k = 11;
		
		int[] C = new int[k];
		
		for(int i=0;i<k;i++)
			C[i]=0;
		
		for(int j=0;j<n;j++)
			C[A[j]] = C[A[j]] + 1;
		
		for(int i=1;i<k;i++)
			C[i] = C[i]+ C[i-1];
		
		for(int j=n-1;j>=0 ;j--){

			B[C[A[j]]] = A[j];
			C[A[j]] = C[A[j]] - 1;
		}
		
		display(B);
		
			
	}
	
	public static void display(int[] arr){
		
		for(int l : arr)
			System.out.print(l + " ");
		System.out.println();
	}
}
