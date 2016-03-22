package prac.test;

import java.util.Scanner;

public class MaximiseXOR {

	static int maxXor(int l, int r) {

		int max = 0;
		
		for(int j=l;j<=r;j++){
			for(int i=j;i<=r;i++){
				int tmp = j^i;
				
				if(tmp > max)
					max = tmp;
				
				System.out.println("L = "+j+ " R = "+i + " xor = "+tmp);
			}
		}
		return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
