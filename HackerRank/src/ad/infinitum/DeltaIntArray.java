package ad.infinitum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeltaIntArray {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int res;
        
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }
        
        int _d;
        _d = Integer.parseInt(in.nextLine().trim());
        
        res = JDelta(_a, _d);
        
        System.out.println(res);
        in.close();
    }

	private static int JDelta(int[] a, int d) {

		int count = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int x : a)
		{
			list.add(x);
		}
		
		for(int x : list){
			int y = x - d;
			if(list.contains(y))
				count++;
		}
		return count;
	}
}

