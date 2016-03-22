package prac.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatternSearchMatrix {

	static int count = 0;
	static int index = 0;
	public static void getIndices(String str,String sub, List<Integer> list){
		
		int ind = 0;
		
    	//System.out.println("count = "+count+" index = "+ind + " str = "+str+ " sub = "+sub);

		if(count==0){
			ind = str.indexOf(sub);
		}
		else{
			//System.out.println(" in else ind = "+ind+" index = "+index);
//			if(ind==0)
//				ind++;
			ind = str.indexOf(sub)+1;
			if (ind==1)
				ind = count;
			//System.out.println(" after else ind = "+ind);

		}
    
		    	
    	if(!str.isEmpty())
    	{
    		//if(!list.contains(ind))
    			list.add(ind);
    		index = ind;
    		if(ind> str.length())
    			return;
    		
    		if(ind==str.length())
    			str = str.substring(0,ind);
    		else
    			str = str.substring(0, ind)+str.substring(ind+1);
    		
    		//System.out.println("count = "+count+" index = "+ind + " str = "+str+ " sub = "+sub);
        	count++;
        	
    		if(str.contains(sub))
    			getIndices(str, sub, list);
    		else
    			return;
    	}
    	else
    		return;
    		
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {

			List<String> matrix = new ArrayList<>();
			List<String> pattern = new ArrayList<>();

			boolean match = false;

			int R = in.nextInt();
			int C = in.nextInt();
			for (int G_i = 0; G_i < R; G_i++) {
				matrix.add(in.next());
			}
			int r = in.nextInt();
			int c = in.nextInt();
			for (int P_i = 0; P_i < r; P_i++) {
				pattern.add(in.next());
			}

			int i = 0;
			int matrix_start_row = 0;

			int matrix_start_index = 0;

			for (int k = 0; k < matrix.size(); k++) {
				String m = matrix.get(k);
				String p =pattern.get(0);
				if (m.contains(p)) {
					
					List<Integer> list = new ArrayList<>();

					getIndices(m, p,list);
					count = 0;
					
					for(int in1 = 0;in1 < list.size();in1++)
					{
						matrix_start_index = list.get(in1);
						matrix_start_row = k;
				

						//System.out.println("j=0 Pattern " + p + " found = " + matrix_start_row + " at index = "+ matrix_start_index);
		
						for (int j = 1; j < pattern.size(); j++) {
							String prow = pattern.get(j);
		
							i = matrix_start_row + 1;
							//System.out.println("j = " + j + " and pattern = " + prow + " i = "+i);

							if(i>=matrix.size())
								break;
							String mrow = matrix.get(i);
		
							if (mrow.contains(prow)) {
								
								List<Integer> list1 = new ArrayList<>();
								
								getIndices(mrow, prow,list1);
								count = 0;

								/*for(int i1 = 0;i1<list1.size();i1++)
									System.out.print(list1.get(i1) + " ");
								System.out.println();*/
								//int tmp_index = mrow.indexOf(prow);
								if(list1.contains(matrix_start_index)){
								//System.out.println("i = " + i + " and row = " + mrow + " tmp-index = " + tmp_index);
		
								//if (tmp_index == matrix_start_index) {
									match = true;
									matrix_start_row++;
								}
								else{
									match = false;
									//System.out.println("index not match");
								}
		
							} 
							else {
								match = false;
								break;
							}
						}
						if(match){
							//System.out.println("match fodun --- breaking" );
							//System.out.println("YES");
							k = matrix.size();
							//return;
						}
					}
				}
				
			}
			if (match)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
