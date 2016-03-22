package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancingSymbols {

	static Map<Character,Character> symbols = new HashMap<>();

	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] chars = input.toCharArray();
		
		//char[] symbols = new char[]{'(','{','['};
		symbols.put('(',')');
		symbols.put('{','}');
		symbols.put('[',']');
		

		boolean check = balanceSymbols(chars);
		sc.close();
		System.out.println(check);
	}

	private static boolean balanceSymbols(char[] chars) {

		boolean check = true;
		int len = chars.length;

		MyStack ms = new MyStack(len);
		for(char c : chars){
			if(symbols.keySet().contains(c))
			{
				ms.push(c);
			}
			else if(symbols.values().contains(c)){
				if(ms.top== -1)
					return false;
				
				char tmp = (char)ms.pop();
				//System.out.println("tmp = "+tmp);
				if(symbols.get(tmp)!=c){
					return false;
				}
			}
		}
		if(ms.top!= -1)
			check = false;
		ms.printStack();	
		return check;
	}
}
