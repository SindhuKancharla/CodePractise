package stacks;

import java.util.Scanner;

public class Solution1 {

	public static void main(String args[] ) throws Exception {

			Scanner in  = new Scanner(System.in);
			int n = Integer.valueOf(in.nextLine());
			
			for(int i=0;i<n;i++){
				
				String sides = in.nextLine();
				
				String[] parts = sides.split(" ");
				
				if(parts[0].equals(parts[1])){
					if(parts[0].equals(parts[2]))
					{
						System.out.println("Equilateral");
					}
					else{
						System.out.println("Isosceles");
					}
				}
				else if(parts[1].equals(parts[2]))
				{
					System.out.println("Isosceles");
				}
				else
					System.out.println("None of these");
			} 
			in.close();
	}
	
}
