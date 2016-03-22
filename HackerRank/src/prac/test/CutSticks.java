package prac.test;

import java.util.ArrayList;
import java.util.Scanner;

public class CutSticks {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());       
        
        ArrayList<Integer> list = new ArrayList<>();
        
        String arr = in.nextLine();
        
        String[] parts = arr.split(" ");
        for(int arr_i=0; arr_i < n; arr_i++){
            list.add(Integer.valueOf(parts[arr_i]));
        }
        
        while(!list.isEmpty())
        {
            int min = list.get(0);

	        for(int i=0;i<list.size();i++)
	        {
	        	if(list.get(i) < min)
	        		min = list.get(i);
	        	
	        }
	        System.out.println(list.size());
	        ArrayList<Integer> templist = new ArrayList<>();
	        
	        for(int i=0;i<list.size();i++)
	        {
	        	int temp = list.get(i)-min;
	        	if(temp!=0)
	        		templist.add(temp);
	        	
	        }
	        list = templist;
	        
	        
        }
    }
}
