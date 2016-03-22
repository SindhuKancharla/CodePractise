package strings;

public class CombinationsOfString {

	public static void main(String[] args) {

		String str = "abc";
		
		getCombinations(str,new StringBuffer(),0);
	
		
	}
	
	public static void getCombinations(String instr, StringBuffer outstr, int index)
	{
	    for (int i = index; i < instr.length(); i++)
	    {
	        outstr.append(instr.charAt(i));
	    	System.out.println(outstr);
	        getCombinations(instr, outstr, i + 1);
	        outstr.deleteCharAt(outstr.length() - 1);	   

	    }
	} 


}
