package prac.test;

import java.util.Scanner;

public class TaumAndBday {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		
		for(int i=0;i<n;i++){
			
			long sum = 0;
			String bw = sc.nextLine();
			String[] parts = bw.split(" ");
			int b = Integer.valueOf(parts[0]);
			int w = Integer.valueOf(parts[1]);

			String xyz = sc.nextLine();
			String[] parts1 = xyz.split(" ");
			long x = Long.valueOf(parts1[0]);
			long y = Long.valueOf(parts1[1]);
			long z = Long.valueOf(parts1[2]);
			
			long actsum = (long)(b*x)+(w*y);
			if(x==y)
			{
				System.out.println(actsum);
				continue;
			}
			else if(x+z < y)
			{
				sum = (long)(b*x + ( w * (x+z)));
				if(sum < actsum)
				{
					System.out.println(sum);
					continue;
				}
				else{
					System.out.println(actsum);
					continue;
				}
			}
			else if(y+z < x)
			{
				sum =(long)( w*y + (b * (y+z)));
				if(sum < actsum)
				{
					System.out.println(sum);
					continue;
				}
				else{
					System.out.println(actsum);
					continue;
				}
			}
			else{
				System.out.println(actsum);
				continue;
			}
		}
		sc.close();
	}
}
