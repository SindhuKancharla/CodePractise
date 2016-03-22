package ad.infinitum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPValidation {

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
				
		for(int i = 0;i<n;i++){
			
			String txt = sc.nextLine();
			System.out.println(txt);
			System.out.println(validateIP(txt));
		}
		sc.close();
	}

	private static String validateIP(String txt) {

		List<Character> hex = new ArrayList<>();
		for(int i=0;i<10;i++)
			hex.add(Character.forDigit(i, 10));
		
		hex.add('a');
		hex.add('b');
		hex.add('c');
		hex.add('d');
		hex.add('e');
		hex.add('f');
		
		String output = "";
		if(txt.contains(":"))
		{
			String[] parts = txt.split(":");
			if(parts.length!=8)
			{
				output = "Neither";
			}
			else
			{
				for(String i : parts){
					char[] chars = i.toCharArray();
					for(Character c : chars){
						if(hex.contains(c)){
							output = "IPv6";
						}
						else{
							output = "Neither";
							break;
						}
					}
				}
			}
		}
		else if(txt.contains(".")){
			
			String[] parts = txt.split("\\.");
			if(parts.length!=4)
			{
				output = "Neither";
			}
			else
			{
				for(String i : parts){
					int num = Integer.valueOf(i);
					if(num>=0 && num <=255){
						output = "IPv4";
					}
					else{
						output = "Neither";
						break;
					}
				}
			}
		}
		else
			output = "Neither";
		
		
		return output;
	}
}
