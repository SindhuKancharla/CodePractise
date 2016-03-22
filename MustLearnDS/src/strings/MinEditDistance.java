package strings;

public class MinEditDistance {

	public static void main(String[] args){
		
		String a = "INTENTION";
		String b = "EXECUTION";
		
		int mind = editDist(a,b);
		System.out.println(mind);
	}

	private static int minimum(int x,int y,int z){
	
		int tmp = Math.min(x, y);
		return Math.min(tmp, z);
	}
	
	private static int editDist(String a, String b) {

		int m = a.length();
		int n = b.length();
		
		// for saving subproblems values
		int dp[][] = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				
				// if first string is empty
				if(i==0)
				{
					dp[i][j] = j;
				}
				// if second string is empty
				else if(j==0)
				{
					dp[i][j] = i;
				}
				// if last 2 chars are same, recur for the next
				else if(a.charAt(i-1)==b.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1];
				}
				// min of 3 operations - insert,remove and substitute
				else{
					dp[i][j] = 1 + minimum(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]);
				}
			}
		}
		return dp[m][n];
	}
}
