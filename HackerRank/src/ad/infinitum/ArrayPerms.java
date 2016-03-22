package ad.infinitum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayPerms {

	public static void main(String[] args) {
		
		Scanner is = new Scanner(System.in);
		int n = Integer.parseInt(is.nextLine());
		
		for(int i=0;i<n;i++){
			
			boolean check = true;
			String input = is.nextLine();
			String[] inparts = input.split(" ");
			int len = Integer.parseInt(inparts[0]);
			int sum = Integer.parseInt(inparts[1]);
			
			//System.out.println("len = "+len + " sum = "+sum);
			
			List<Integer> A = new ArrayList<>();
			
			String[] aarr = is.nextLine().split(" ");
			for(int j=0;j<len;j++){
				A.add(Integer.parseInt(aarr[j]));
				//System.out.println(Integer.parseInt(aarr[j]));
			}
			
			List<Integer> B = new ArrayList<>();
			
			String[] barr = is.nextLine().split(" ");
			for(int j=0;j<len;j++){
				B.add(Integer.parseInt(barr[j]));
				//System.out.println(Integer.parseInt(barr[j]));
			}
			
			Collections.sort(A);
			Collections.sort(B);
			Collections.reverse(B);

			
			for(int k = 0;k<len;k++){
				
				//System.out.println(A.get(k) + " - "+B.get(k));
				if(A.get(k) + B.get(k) < sum)
				{
					System.out.println("NO");
					check = false;
					break;
				}
			}
			if(check)
				System.out.println("YES");
			
		}
		
		is.close();
	}
}
