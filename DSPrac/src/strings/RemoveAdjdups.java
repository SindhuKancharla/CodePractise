package strings;

public class RemoveAdjdups {

	public static void main(String[] args){
		
		String str = "ABCCBCBA";
		
		String ne = removeDups(str);
		System.out.println(ne);
	}

	private static String removeDups(String str) {

		StringBuffer sb = new StringBuffer(str);
		int j=0;
		
		for(int i=1;i<str.length();i++){
			
			while(sb.charAt(i)== sb.charAt(j) && j>=0)
			{
				i++;
				j--;
			}
			sb.setCharAt(++j,sb.charAt(i));
			
		}
		
		String out=sb.substring(0, ++j);
		
		return out;
	}
}
