package trees;


public class TestBSTNode {

	public static void main(String[] args)
	{
		BSTNode gl = new BSTNode(1);
		BSTNode gl2 = new BSTNode(6);

		BSTNode glr = new BSTNode(15);
		BSTNode glr2 = new BSTNode(12);

		BSTNode left = new BSTNode(2,gl,gl2);
		BSTNode right = new BSTNode(14,glr2,glr);
		BSTNode tree = new BSTNode(10,left,right);
		
		tree.add(tree, 20);
		tree.inorderTraversal(tree);
		System.out.println( );

		System.out.println("The given tree is a BST : "+tree.isBST(tree));
		BSTNode min = tree.findMin(tree);
		if(min!=null)
			System.out.println("Min node = "+min.data);
		
		BSTNode max = tree.findMax(tree);
		if(min!=null)
			System.out.println("Max node = "+max.data);
		
		BSTNode gltm = new BSTNode(10);

		System.out.println("The node "+ gltm.data + " is present in the tree : "+ tree.findNode(tree, gltm));
		
		BSTNode lca = tree.LCA(tree, left, glr);
		if(lca!=null)
		{
			System.out.println("Least Common Ancestor = "+lca.data);
		}
		
		
	}
}
