package trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import queues.MyQueue;

public class TopView {

	public static void main(String[] args){
		
		TreeNode gllr = new TreeNode(9);
		TreeNode gl = new TreeNode(1,null,gllr);
		TreeNode glr = new TreeNode(4);
		TreeNode left = new TreeNode(5,gl,glr);
		TreeNode grl = new TreeNode(6);
		TreeNode grrl = new TreeNode(8);
		TreeNode grr = new TreeNode(7,grrl,null);

		TreeNode right = new TreeNode(2,grl,grr);

		TreeNode tree = new TreeNode(3,left,right);
		
		TreeNode.inorderTransversal(tree);
		
		top_view(tree,0);
		levelOrderTraversal(tree);
		
	}

	static Map<Integer,Integer> map = new HashMap<>();
	
	private static void top_view(TreeNode tree, int level) {

		if(tree==null)
			return;

		top_view(tree.left,level+1);
		
		if(!map.containsKey(level)){
			System.out.println("key = "+level + " val = "+tree.data);

			map.put(level, (Integer) tree.data);
		}
		
		
		top_view(tree.right,level-1);
		
	}
	
	private static void levelOrderTraversal(TreeNode root){
		
		LinkedList<TreeNode> list = new LinkedList<>();
		list.add(root);
		
		while(!list.isEmpty()){
			
			TreeNode ob = (TreeNode) list.removeFirst();
			System.out.println(ob.data);
			
			if(ob.left!=null)
				list.add(ob.left);
			if(ob.right!=null)
				list.add(ob.right);
		}
	}
}
