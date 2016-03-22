package strings;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigIntegerCal {

	public static void main(String[] args){
		Scanner is = new Scanner(System.in);
		
		List<BigDecimal> list = new ArrayList<>();
		
		int n = is.nextInt();
		
		while(n>0){
			BigDecimal a = is.nextBigDecimal();
	
			System.out.println(a);
			list.add(a);
			n--;
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(BigDecimal c : list)
			System.out.println(c);
	}
}
