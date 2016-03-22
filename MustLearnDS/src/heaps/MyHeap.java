package heaps;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyHeap {

	private int heapSize;
	int[] heap;
	
	public MyHeap(int capacity){
		
		heapSize = 0;
		heap = new int[capacity+1];
		Arrays.fill(heap, -1);
	}
	
	public boolean isEmpty(){
		return heapSize==0;
	}
	
	public boolean isFull(){
		return heapSize == heap.length;
	}
	
	public int parent(int i)
	{
		return (i-1)/2;
	}
	
	public int leftChild(int i)
	{
		return 2*i + 1;
	}
	
	public int rightChild(int i)
	{
		return 2*i + 2;
	}
	
	public void insert(int i)
	{
		if(isFull())
			throw new NoSuchElementException();
		
		heapSize++;
		heap[heapSize] = i;
		heapifyUp(heapSize-1);
	}

	public int findMin()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		
		return heap[0];
	}
	
	public int deleteMin(){
		
		int del = heap[0];
		
		delete(0);
		return del;
	}
	
	private int delete(int i) {

		if(isEmpty())
			throw new NoSuchElementException();
		
		int del = heap[i];
		heap[i] = heap[heapSize-1];
		heapSize--;
		
		heapifyDown(i);
		
		return del;
	}

	private void heapifyDown(int i) {
		int min;
		int left = leftChild(i);
		int right = rightChild(i);
		
		if(left!= -1 && heap[left] < heap[i])
		{
			min = left;
		}
		else
			min = i;
		if(right!= -1 && heap[right] < heap[min])
		{
			min = right;
		}
		
		if(min!=i)
		{
			int tmp = heap[i];
			heap[i] = heap[min];
			heap[min] = tmp;
		}
		heapifyDown(min);
	}

	private void heapifyUp(int childIndex) {
		
		int tmp = heap[childIndex];
		
		while(childIndex>0 && tmp<heap[parent(childIndex)])
		{
			heap[childIndex] = heap[parent(childIndex)];
			childIndex = parent(childIndex);
		}
		heap[childIndex] = tmp;
	}

	public void printHeap()
    {
        System.out.print("\nHeap = ");
        for (int i = 0; i < heapSize; i++)
            System.out.print(heap[i] +" ");
        System.out.println();
    }

	public void makeEmpty() {

		heapSize=0;
	}     
}
