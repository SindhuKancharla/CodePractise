package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import queues.MyQueueLL;

class NewNode{
	TreeNode node;
	int level;
}
public class LevelOrderTraversalFromBottom {

	public static void main(String[] args) {

		//TreeNode ll = new TreeNode(2);
		//TreeNode lr = new TreeNode(5);
		TreeNode l = new TreeNode(null,null,9);
		
		TreeNode rl = new TreeNode(7);
		TreeNode rr = new TreeNode(15);
		TreeNode right = new TreeNode(rl,rr,20);
		
		TreeNode root = new TreeNode(l,right,3);
		
		
		List<List<Integer>> lists = levelOrderReverse(root);
		
		for(List<Integer> list : lists)
		{	
			for(Integer i : list)
				System.out.print(i+ " ");
			System.out.println();
		}
	}

	private static List<List<Integer>> levelOrderReverse(TreeNode root) {
		
		List<List<Integer>> lists = new ArrayList<>();
		MyQueueLL q = new MyQueueLL();
		Stack<NewNode> s = new Stack<NewNode>();
		q.enQueue(root);
		
		while(!q.isEmpty())
		{
			TreeNode tmp = (TreeNode) q.deQueue();
			NewNode n = new NewNode();
			n.node = tmp;
			n.level = tmp.getHeight(tmp);

			System.out.println(tmp.val + " "+n.level);
			s.push(n);
			
			if(tmp.right!=null)
				q.enQueue(tmp.right);
			if(tmp.left!=null)
				q.enQueue(tmp.left);
			
		}
		
		List<Integer> list= new ArrayList<>();
		NewNode prev=null;

		while(!s.isEmpty())
		{
			NewNode n = s.pop();
			
			if(prev==null || n.level==prev.level)
			{
				list.add(n.node.val);
			}
			else if( prev!=null && n.level!=prev.level )
			{
				lists.add(list);
				list = new ArrayList<>();
				list.add(n.node.val);
			}

			prev = n;

		}
		lists.add(list);
		
		return lists;
	}


}
