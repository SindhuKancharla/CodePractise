package ad.infinitum;

import java.util.Scanner;

public class FlipBitsMax1s {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int res;
        
        int _b_size = 0;
        _b_size = Integer.parseInt(in.nextLine().trim());
        int[] _b = new int[_b_size];
        int _b_item;
        for(int _b_i = 0; _b_i < _b_size; _b_i++) {
            _b_item = Integer.parseInt(in.nextLine().trim());
            _b[_b_i] = _b_item;
        }
        
        res = BitFlip(_b);
        
        System.out.println(res);
        in.close();
    }

	private static int BitFlip(int[] b) {

		int max = 0;
		int len = b.length;
		
		
		
		
		for(int i=0;i<len;i++){
			
			int[] c = new int[len];

			for(int k = 0;k<len;k++)
				c[k] = b[k];
			
			for(int j=i;j<len;j++){
				display(b);
				
				
				//System.out.println("L= "+i+" R= "+j);
				///display(c);
				if(b[j]==0){
					b[j] = 1;
				}
				else{
					b[j] = 0;
				}
					
				int tmp = CountOnes(b);
				if(tmp>max)
					max = tmp;
				
				//System.out.println("Num of 1s = "+tmp + " max = "+max);
				
			}
			b=c;
		}
		
		return max;
	}

	private static void display(int[] arr){
		for(int x : arr)
			System.out.print(x + " ");
		
		System.out.println();
	}
	private static int CountOnes(int[] b) {
		int count = 0;

		
		for(int i : b){
			System.out.print(i + " ");
			if(i==1)
				count++;
		}
		return count;
	}
}
