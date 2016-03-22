package linkedlists.test;

import static org.junit.Assert.*;

import org.junit.Test;

import linkedlists.SinLinkedList;

public class TestSinLinkedList extends SinLinkedList{
	
	@Test
	public void testSortedInsert() {

		

		int j=0;
		for (int i=0;i<100;i++) j=j++;
		System.out.println(j);
		
		String n = "I can do this";
		n.replace("can", "cannot");
		n.replaceAll("can.*", "will");
		System.out.println(n);
	}

	final int x;

	public TestSinLinkedList() {
		x = 0;
	}
	private int nuber;
	
	public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}

	public static void main(String... args){

		System.out.println(sqrt(5));
		doOp();
	}
	
	static void doOp() {
		
		try{
			throw new IllegalArgumentException();
			
		}
		catch(Exception e)
		{
			System.out.println("1");
			
		}
	}
}
