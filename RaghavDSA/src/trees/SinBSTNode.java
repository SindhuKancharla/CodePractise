package trees;

public class SinBSTNode {

	int data;
	SinBSTNode left,right;
	
	public SinBSTNode(int data) {
		this.data = data;
	}
	
	public SinBSTNode(int data,SinBSTNode left,SinBSTNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public boolean areIsomorphic(SinBSTNode a,SinBSTNode b){
	
		if(a==null && b==null)
			return true;
		if((a==null && b!=null) || (a!=null && b==null))
			return false;
		if(a.data!= b.data)
			return false;
		return areIsomorphic(a.left, b.right) && areIsomorphic(a.right, b.left);
	}
	
	public SinBSTNode LCA(SinBSTNode root,SinBSTNode a, SinBSTNode b){
				
		if(root==null)
			return null;
		if(root==a || root==b)
			return root;
		
		if((root.data > a.data && root.data < b.data) || (root.data<a.data && root.data>b.data))
			return root;
		
		if(root.data > a.data && root.data >b.data)
		{
			return LCA(root.left,a,b);
		}
		else if(root.data <a.data && root.data<b.data)
		{
			return LCA(root.right,a,b);
		}
		return null;	
	}
	
	public static void main(String[] args){
		
		SinBSTNode l1 = new SinBSTNode(2);
		SinBSTNode r1 = new SinBSTNode(4);
		
		SinBSTNode l2 = new SinBSTNode(3,l1,r1);
		
		SinBSTNode lr1 = new SinBSTNode(6);
		SinBSTNode lr2 = new SinBSTNode(8);
		
		SinBSTNode cr2 = new SinBSTNode(7,lr1,lr2);
		SinBSTNode root = new SinBSTNode(5,l2,cr2);
		
		System.out.println(root.LCA(root,cr2,l2).data);
	}
}
