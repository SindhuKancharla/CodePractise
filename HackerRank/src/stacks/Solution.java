package stacks;

import java.util.Scanner;

public class Solution {

	
	
	public static void main(String[] args) {

		NewStack s1 = new NewStack();
		NewStack maxs = new NewStack();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n+1;i++){
			
			String str = sc.nextLine();
		
			if (str.startsWith("1")) {
				String[] parts = str.split(" ");
				long val = Long.valueOf(parts[1]);
				s1.push(val);
				if(maxs.top() < val)
				{
					maxs.push(val);
				}
				
			} 
			else if(str.equals("2")){
					long tmp = s1.top();
					s1.pop();
					if(tmp == maxs.top())
						maxs.pop();
			}
			else if (str.equals("3")) {
				System.out.println(maxs.top());
			}
			
		}
		sc.close();
	}
}	
 class NewStack{
		
		public NewStack(){
			
		}
		long[] stack = new long[10000];
		int top = -1;
	
		//int mtop = -1;
		
		public void push(long val) {
			stack[++top]= val;
		}
	
		public void pop() {
			top--;
		}
	
		public long top() {
			if(top==-1)
				return -1;
			else
				return stack[top];
		}
	}
