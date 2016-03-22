package ad.infinitum;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubstringPalindrome {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
     
        int res;
        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
        
        res = palindrome(_str);
        System.out.println(res);
        in.close();
    }
	
    static int palindrome(String str) {

    	int count = 0;
    	System.out.println(str);
    	
    	
    	char[] arr = str.toCharArray();
    	
    	Map<Character,Integer> dedupCharsMap = new HashMap<>();
    	
    	for(Character c : arr){
    		if(dedupCharsMap.containsKey(c))
    		{
    			int score = dedupCharsMap.get(c);
    			dedupCharsMap.put(c, ++score);
    		}
    		else{
    			dedupCharsMap.put(c, 1);
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> en : dedupCharsMap.entrySet())
    	{
    		if(en.getValue()==1)
    			count++;
    	}

    	System.out.println(count);
    	
    	return count;

    }

}
