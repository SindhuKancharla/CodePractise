package collects;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UniquesFromSubArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		Map<Integer, Integer> map = new HashMap<>();
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			//System.out.println(" num = " + num);
			deque.offerFirst(num);
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				int tmp = map.get(num);
				map.put(num, ++tmp);
			}
			
			if (deque.size() == m) {
				
				int count_unique = map.size();
				//System.out.println("map size = " + count_unique);
				if (max < count_unique) {
					max = count_unique;
				}
				//int top = deque.peek();
				int top = deque.pollLast();

				if (map.get(top) == 1) {
					map.remove(top);
				} else {
					int tmp = map.get(num);
					map.put(num, --tmp);
				}
				
			}

		}
		System.out.println(max);
		in.close();
	}
}
