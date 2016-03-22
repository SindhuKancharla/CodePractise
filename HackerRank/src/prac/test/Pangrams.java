package prac.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Pangrams {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		Map<Character,Integer> alphabets = new HashMap<>();
		alphabets.put('a', 0);
		alphabets.put('b', 0);
		alphabets.put('c', 0);
		alphabets.put('d', 0);
		alphabets.put('e', 0);
		alphabets.put('f', 0);
		alphabets.put('g', 0);
		alphabets.put('h', 0);
		alphabets.put('i', 0);
		alphabets.put('j', 0);
		alphabets.put('k', 0);
		alphabets.put('l', 0);
		alphabets.put('m', 0);
		alphabets.put('n', 0);
		alphabets.put('o', 0);
		alphabets.put('p', 0);
		alphabets.put('q', 0);
		alphabets.put('r', 0);
		alphabets.put('s', 0);
		alphabets.put('t', 0);
		alphabets.put('u', 0);
		alphabets.put('v', 0);
		alphabets.put('w', 0);
		alphabets.put('x', 0);
		alphabets.put('y', 0);
		alphabets.put('z', 0);

		char[] str = s.toLowerCase().toCharArray();
		for(Character c : str)
		{
			
			alphabets.put(c, 1);
		}
		
		
		if(alphabets.values().contains(0))
			System.out.println("not pangram");
		else
			System.out.println("pangram");
	}

}
