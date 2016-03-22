package maths;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SherlockPlanes {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int n = Integer.valueOf(in.nextLine());
		
		for(int i=0;i<n;i++){
			
			Set<Integer> xs = new HashSet<>();
			Set<Integer> ys = new HashSet<>();
			Set<Integer> zs = new HashSet<>();
			
			for(int j=0;j<4;j++){
				String x = in.nextLine();
				
				String[] parts = x.split(" ");
				xs.add(Integer.valueOf(parts[0]));
				ys.add(Integer.valueOf(parts[1]));
				zs.add(Integer.valueOf(parts[2]));
			}
			
			if(xs.size()==1 || ys.size()==1 || zs.size()==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		
		
		in.close();
	}

}
