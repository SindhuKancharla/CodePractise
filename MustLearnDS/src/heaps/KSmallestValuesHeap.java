package heaps;

public class KSmallestValuesHeap {

	static int[] array={11,32,2,4,1,9,11};
	static int k=3;
	
	public static void main(String[] args){
		for(int i=0;i<k;i++){//klog(k)
			HeapifyUp(i);
		}
		for(int i=k;i<array.length;i++){//(n-k)logk
			if(array[i]<array[0]){
				int temp = array[i];
				array[i] = array[0];
				array[0]=temp;
				HeapifyDown(0);
			}
		}
		for(int i=0;i<k;i++)
			System.out.print(array[i]+" ");
	}
	
	public static void HeapifyUp(int last){
		if(last==0)
			return;
		int parentIndex = (last-1)/2;
		// Max Heap
		if(array[parentIndex]<array[last]){
			int temp = array[parentIndex];
			array[parentIndex] = array[last];
			array[last]=temp;
			HeapifyUp(parentIndex);
		}
	}
	
	public static void HeapifyDown(int first){		
		int leftChildIndex = first*2+1;
		int rightChildIndex = first*2+2;
		if(leftChildIndex>=k)
			return;
		int maxChildIndex = leftChildIndex;
		if(array[rightChildIndex]>array[leftChildIndex] && rightChildIndex<k)
			maxChildIndex = rightChildIndex;
		
		if(array[maxChildIndex]>array[first]){
			int temp = array[maxChildIndex];
			array[maxChildIndex] = array[first];
			array[first]=temp;
			HeapifyDown(maxChildIndex);
		}
	}

}
