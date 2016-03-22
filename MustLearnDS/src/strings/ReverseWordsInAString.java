package strings;

public class ReverseWordsInAString {

	public static void main(String[] args){
		
		String str = "Do or do not, there is no try.";
		
		StringBuilder out  = new StringBuilder();
		String totalrev = reverse(str);
		
		String[] parts = totalrev.split(" ");
		for(String s : parts){
			s = reverse(s);
			out.append(s + " ");
		}
		System.out.println(out.toString());
	}
	
	private static String reverse(String str){
		
		char[] arr = str.toCharArray();
		int len = str.length();
		int mid = len/2;
		
		len--;
		for(int i=0;i<mid;i++){
			char tmp = arr[i];
			arr[i] = arr[len-i];
			arr[len-i] = tmp; 
		}
		String ns = new String(arr);
		return ns;
		
	}
}
