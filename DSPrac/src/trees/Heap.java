package trees;

public class Heap {

	public int[] array;
	public int count;
	int capacity;
	int heap_type;
	
	public Heap(int capacity, int heap_type){
		this.heap_type = heap_type;
		this.capacity = capacity;
		this.count = 0;
		this.array = new int[capacity];
	}
	
	public int Parent(int i){
		if(i<= 0 || i>= this.count){
			return -1;
		}
		return i-1/2;
	}
	
	public int LeftChild(int i){
		int left = 2*i + 1;
		if(left > this.count)
			return -1;
		return left;
	}
	
	public int RightChild(int i){
		int right = 2*i + 2;
		if(right > this.count)
			return -1;
		return right;
	}
	
	public int GetMaximum(){
		if(this.count==0)
			return -1;
		
		return this.array[0];
	}
	
	public void PercolateDown(int i){
		
		int l,r,max = 0,tmp;
		
		l = LeftChild(i);
		r = RightChild(i);
		
		if(l!= -1 && this.array[i] < this.array[l])
			max = l;
		
		if(r!= -1 && this.array[r] > this.array[l])
			max = r;
		
		if(max!=i){
			tmp = this.array[i];
			this.array[i] = this.array[max];
			this.array[max] = tmp;
		}
		PercolateDown(max);
	}
	
	int DeleteMax(){
		if(this.count==0)
			return -1;
		
		int data = this.array[0];
		this.array[0] = this.array[this.count-1];
		this.count--;
		PercolateDown(0);
		
		return data;
	}
}
