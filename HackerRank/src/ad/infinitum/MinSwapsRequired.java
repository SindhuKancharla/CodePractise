package ad.infinitum;

import java.util.Scanner;

public class MinSwapsRequired {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int res;
		int _m;
		_m = Integer.parseInt(in.nextLine().trim());

		String _s;
		try {
			_s = in.nextLine();
		} catch (Exception e) {
			_s = null;
		}

		res = minimumSwapsRequired(_m, _s);
		System.out.println(res);
		in.close();
	}

	private static int minimumSwapsRequired(int m, String str) {

		int min_swaps = 100;
		int swaps = 0;
		int cur_g = 0;
		int cur_b = 0;
		for(int i=0;i<str.length();i++)
		{
			System.out.println("minswaps = "+min_swaps);
			if(str.charAt(i)=='G')
			{
				cur_g++;
				if(cur_g==m)
				{
					return 0;
				}
			}
			else if(str.charAt(i)=='X')
			{
				cur_g++;
				
				
				if(min_swaps>swaps)
				{
					min_swaps = swaps;
				}
				if(cur_g == m)
				{
					return min_swaps;
				}
//				else
//				{
//					cur_g--;
//				}
			}
			else{
				cur_b = i;
			}
		}
		return min_swaps;
	}

}
