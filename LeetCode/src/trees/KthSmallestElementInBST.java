package trees;

import java.util.Stack;

public class KthSmallestElementInBST {

	public static void main(String[] args) {

		
		BSTNode ll = new BSTNode(2);
		BSTNode lr = new BSTNode(5);
		BSTNode l = new BSTNode(ll,lr,4);
		
		BSTNode rl = new BSTNode(7);
		BSTNode rr = new BSTNode(10);
		BSTNode right = new BSTNode(rl,rr,9);
		
		BSTNode root = new BSTNode(l,right,6);
		
		ksmall(root,6);

	}

	private static void ksmall(BSTNode root,int k) {

		 Stack<BSTNode> st = new Stack<>();
		 st.push(root);
		 
		 while(!st.isEmpty())
		 {
			 while(root.left!=null)
			 {
				 st.push(root.left);
				 root = root.left;
			 }
			 
			 BSTNode tmp = st.pop();
			 k--;
			 if(k==0)
			 {
				 System.out.print(tmp.val+" ");
				 break;
			 }
			 
			 
			 if(tmp.right!=null)
			 {
				 st.push(tmp.right);
				 root = tmp.right;
			 }
		 }
	}

}
