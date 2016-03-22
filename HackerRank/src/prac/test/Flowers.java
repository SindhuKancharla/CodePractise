package prac.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Flowers {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int N, K;
		N = in.nextInt();
		K = in.nextInt();
		int result = 0;

		int C[] = new int[N];

		List<Integer> cmax = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			C[i] = in.nextInt();
		}

		for(int i=0;i<N;i++){
			cmax.add(C[i]);
		}
		Collections.sort(cmax);

		Collections.reverse(cmax);
		
		for(int i=0,j=0;i<N;){
			
			//System.out.println("max = "+cmax.get(i)+ " i = "+i+" j ="+j);
			result = result + (j+1)*cmax.get(i);

			i++;
			int tmp = i%K;
			//System.out.println("tmp = "+tmp+" sum = "+result);

			if(tmp==0)
				j++;
			
		}
		
		System.out.println(result);

		in.close();
	}
}
