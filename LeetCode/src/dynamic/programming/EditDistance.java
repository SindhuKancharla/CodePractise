package dynamic.programming;

public class EditDistance {

	public static void main(String[] args) {

		String s = "INSERTION";
		String t = "DELETION";
		
		System.out.println(editDistance(s,t));
	}

	private static int editDistance(String s, String t) {

		int l1 = s.length();
		int l2 = t.length();
		
		int[][] dp = new int[l1+1][l2+1];
		
		for(int i=0;i<l1;i++)
		{
			dp[i][0] = i;
		}
		
		for(int j=0; j<l2;j++)
		{
			dp[0][j] = j;
		}
		
		for(int i=0;i<l1; i++)
		{
			char c = s.charAt(i);
			for(int j=0;j<l2;j++)
			{
				char d = t.charAt(j);
				
				if(c==d)
				{
					dp[i+1][j+1] = dp[i][j];
				}
				else{
					int delete = dp[i+1][j] + 1;
					int replace = dp[i][j] + 1;
					int insert = dp[i][j+1] + 1;
					
					int min = Math.min(delete, insert);
					min = Math.min(min, replace);
					
					dp[i+1][j+1] = min;
				}
			}
		}
		return dp[l1][l2];
	}

}
