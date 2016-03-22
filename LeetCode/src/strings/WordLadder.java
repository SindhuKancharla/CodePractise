package strings;

import java.util.ArrayList;
import java.util.List;

public class WordLadder {

	static List<Character> alphabets = new ArrayList<>();
	
	public static void main(String[] args) {

		String start = "hit";
		String end = "cog";
		
		List<String> dict = new ArrayList<>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		dict.add(end);
		
		for(char c ='a';c<='z';c++)
			alphabets.add(c);
		
		int numSteps = 0;
		numSteps = transformations(start,end,dict,numSteps);
		System.out.println(numSteps);
	}

	private static int transformations(String start, String end, List<String> dict,int numSteps) {

		if(start.equals(end))
			return numSteps;
		
		int sl = start.length();
		char[] st = start.toCharArray();
		
		
		boolean found = false;
		String news = "";
		for(int i=sl-1;i>=0;i--)
		{			
			char c = st[i];
			boolean check = false;
			for(char alpha : alphabets)
			{
				st[i] = alpha;
				
				news = new String(st);
				System.out.println(news);

				if(start.equals(news))
					continue;
				if(dict.contains(news))
				{
					System.out.println(" am in dict !!!");
					numSteps++;
					
					if(news.equals(end)){
						System.out.println(" end word found !!!" + numSteps);
						found = true;
						return numSteps;
					}
					check = true;
					break;
				}
			}
			if(!check)
				st[i] = c;
		}
		
		if(!found)
		{
			numSteps = transformations(news, end, dict, numSteps);
		}
		
		return numSteps;
		
	}

}
