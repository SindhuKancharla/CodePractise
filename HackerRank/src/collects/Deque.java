package collects;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Deque {

	 public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int max = 0;
         ArrayDeque<Integer> deque = new ArrayDeque<>();
         int n = in.nextInt();
         int m = in.nextInt();

         for (int i = 0; i < n; i++) {
             int num = in.nextInt();
             deque.add(num);
             if(deque.size()==m)
             {
            	 int count_unique = getUnqFromDeque(deque);
            	 if(max<count_unique)
            	 {
            		 max = count_unique;
            	 }
            	 deque.poll();
             }
         }
         System.out.println(max);
         in.close();
     }

	private static int getUnqFromDeque(ArrayDeque<Integer> deque) {

		Map<Integer,Boolean> map = new HashMap<>();
		
		int count = 0;
		Iterator<Integer> it = deque.iterator();
		while(it.hasNext())
		{
			int x = it.next();
			//System.out.println(x);
			if(!map.containsKey(x))
			{
				map.put(x, true);
			}
			
		}
		
		for(Entry<Integer,Boolean> en : map.entrySet())
		{
			if(en.getValue())
			{
				//System.out.println(en.getKey());
				count++;
			}
		}
		return count;
	}
}
