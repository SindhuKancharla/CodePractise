package ad.infinitum;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPRegex {

	static Matcher matcher;
	static Pattern pattern;
	
	public static void main(String[] args) {

		String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		
		pattern = Pattern.compile(regex);
		
		Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            matcher = pattern.matcher(IP);
            
            System.out.println(matcher.matches());
        }
        in.close();
	}

}

class myRegex{
	
	myRegex(){
		
		Pattern.compile(pattern);
	}
	String pattern = "^([01]?\\d\\d? | 2[0-4]?\\d | 25[0-5] )\\.([01]?\\d\\d? | 2[0-4]?\\d | 25[0-5] )\\."
			+ "([01]?\\d\\d? | 2[0-4]?\\d | 25[0-5] )\\.([01]?\\d\\d? | 2[0-4]?\\d | 25[0-5] )$";
	
}