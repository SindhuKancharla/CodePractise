package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestAddressValues {

	@Test
	public void test() {
		int i = 10;
		
		int j = i;
		
		System.out.println("i = "+ i + " j = "+j);
		i = 30;
		System.out.println("i = "+ i + " j = "+j);

		j = 20;
		System.out.println("i = "+ i +" j = "+j);

		Integer in = new Integer(1);
		
		Integer jn = in;
		
		System.out.println("i = "+ in +" j = "+jn);
		in = 3;
		
		System.out.println("i = "+ in +" j = "+jn);
		jn = 2;
		
		System.out.println("i = "+ in +" j = "+jn);
		String x = "hello";

		String s = x;
		//s = x;
		
		String t = new String("hello");
		
		System.out.println(t.equals(x));
		System.out.println(t==x);
		
		x = "why";
		System.out.println("s = "+s + " x = "+x);
		List<String> list1 = new ArrayList<>();
		list1.add(s);
		
		List<String> list2 = list1;
		
		System.out.println("l1 = "+list1.size() + " l2 = "+list2.size());
		
		list2.add(t);
		
		System.out.println("l1 = "+list1.size() + " l2 = "+list2.size());
		list1.add(x);
		System.out.println("l1 = "+list1.size() + " l2 = "+list2.size());

		
		String s1 = "Mississippi";
		String s2 = s1;
		s1 = s1.replace('n', '!');
		System.out.println(s1); // Prints "M!ss!ss!pp!"
		System.out.println(s2); // Prints "Mississippi"
		System.out.println(s1 == s2); // Prints "false" as s1 and s2 are two different objects
	}
	
	@Test
	public void arrayReferences() {
		final int[] myArray = new int[] {0, 1, 2, 3, 4, 5}; 
		int[] arrayReference2 = myArray;
		arrayReference2[5] = 99;
		System.out.println(arrayReference2[5]);
		System.out.println(myArray[5]);
		assertFalse(myArray[5] == 5);
	}


	@Test
	public void stringCreation() {
		String hs = "Hello World!";
		
		String helloString1 = new String("Hello World!"); 
		String helloString2 = "Hello World!";
		System.out.println(helloString1==helloString2);
		System.out.println(hs==helloString1);
		System.out.println(hs==helloString2);
		assertEquals(helloString1, helloString2);
	}

}
