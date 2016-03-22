package ad.infinitum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COuntDuplicates {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int res;
        
        int _numbers_size = Integer.parseInt(in.nextLine());
        int[] _numbers = new int[_numbers_size];
        int _numbers_item;
        for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
            _numbers_item = Integer.parseInt(in.nextLine());
            _numbers[_numbers_i] = _numbers_item;
        }
        
        res = countDuplicates(_numbers);
        System.out.println(res);
        in.close();
    }

	private static int countDuplicates(int[] numbers) {

		Map<Integer,Integer> map = new HashMap<>();
		
		int count = 0;
		for(int i : numbers){
			if(map.containsKey(i)){
				int tmp = map.get(i);
				map.put(i, ++tmp);
			}
			else{
				map.put(i, 1);
			}
		}
		
		for(int v : map.values())
		{
			if(v>1)
				count++;
		}
		return count;
	}
}
