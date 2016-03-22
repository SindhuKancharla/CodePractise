package trees;

public class TestTreeNodes {

	public static void main(String[] args)
	{
		TreeNode gl = new TreeNode(4);
		TreeNode glr = new TreeNode(5);
		TreeNode left = new TreeNode(2,gl,glr);
		TreeNode right = new TreeNode(3);
		TreeNode tree = new TreeNode(1,left,right);
		
		
		TreeNode gl1 = new TreeNode(4);
		TreeNode glr1 = new TreeNode(5);
		TreeNode left1 = new TreeNode(2,glr1,gl1);
		TreeNode right1 = new TreeNode(3);
		TreeNode tree1 = new TreeNode(1,right1,left1);
		
		tree.verticalSum(tree,0);
		//tree.printAllAncestors(tree, glr);
		/*TreeNode lca = tree1.LeastCommonAncestor(tree1, gl1, glr1);
		if(lca!=null)
			System.out.println(lca.data);
		else
			System.out.println("No LCA");
			
			*/
		//System.out.println(tree.findNode(tree, 6));
		//System.out.println(TreeNode.checkMirrors(tree, tree1));
	//	int numOfLeaves = tree1.printLeaves(tree1);
		//System.out.println("Number of leaf nodes = "+numOfLeaves);
		//tree.levelorderTraversal(tree);
		//System.out.println("max = "+tree.findMax(tree));
		/*System.out.println("------------------pre order ---------");
		TreeNode.preorderTraversal(tree);
		System.out.println("------------------post order ---------");
		TreeNode.postorderTraversal(tree);
		System.out.println("------------------in order ---------");
		TreeNode.inorderTransversal(tree);
		int total = tree.findTotal(tree);
		System.out.println("Total = "+total);*/
	}

	
	
	
}
