/**
 * 
 */
package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author sindhu
 *
 */
public class BinaryTree {

	/**
	 * 
	 */
	public BinaryTree() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		MyTreeNode lr1 = new MyTreeNode(6);
		MyTreeNode lr2 = new MyTreeNode(9);

		MyTreeNode gr = new MyTreeNode(7,lr1,lr2);
		MyTreeNode ll = new MyTreeNode(3);
		
		MyTreeNode r = new MyTreeNode(1);
		
		MyTreeNode lr = new MyTreeNode(2,r,ll);

		MyTreeNode root = new MyTreeNode(4,lr,gr);
		
		gr = new MyTreeNode(7,lr1,lr2);
		lr = new MyTreeNode(2,r,ll);
		MyTreeNode orig = new MyTreeNode(4,lr,gr);
		
		System.out.println(isBalanced(root));
		System.out.println(isBalancedBetter(root));
		verticalSum(root,0);
		
		for(Entry<Integer,List<Integer>> en : map.entrySet())
		{
			//System.out.println(en.getKey());
			
			for(int i : en.getValue())
			{
				System.out.print(i + " ");
			}
		}
		
		
		System.out.println();
		
		verticalOrder(root, 0);
		System.out.println("vertical order view ----------------");
		System.out.println("-----original------");
		TreeTraversals.inorder(root);
		System.out.println();

		mirror(root);
		
		System.out.println("----mirrorr----");
		TreeTraversals.inorder(root);
		System.out.println();
		
		System.out.println("----orig----");
		TreeTraversals.inorder(orig);
		System.out.println();
		
		System.out.println(isomorphs(root, orig));
		

	}
	
	
	private static boolean isomorphs(MyTreeNode r1, MyTreeNode r2)
	{
		if(r1==null && r2==null)
			return true;
		//System.out.println("left = " +r1.data + "right = "+r2.data);

		if(r1==null || r2==null)
			return false;
		
		if(r1.data!=r2.data)
			return false;
		
		return isomorphs(r1.left, r2.right) && isomorphs(r1.right, r2.left);
		
	}
	
	private static void mirror(MyTreeNode root)
	{
		if(root==null)
			return;
		
		mirror(root.left);
		mirror(root.right);
		
		if(root.left!=null && root.right!=null)
		{
			MyTreeNode tmp = root.right;
			root.right = root.left;
			root.left = tmp;
		}
		
		
	}

	private static boolean isBalanced(MyTreeNode root) {

		if(root==null )
			return true;
		
		int left = height(root.left);
		
		int right = height(root.right);

		if(Math.abs(left-right)>1)
			return false;
		
		return isBalanced(root.left) && isBalanced(root.right);
	}

	public static int height(MyTreeNode root)
	{
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left),height(root.right));
	}
	
	private static boolean isBalancedBetter(MyTreeNode root)
	{
		int h = getHeight(root);
		
		if(h==-1)
			return false;
		return true;
	}
	
	private static int getHeight(MyTreeNode root)
	{
		if(root==null)
			return 0;
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		if(left== -1 || right ==-1)
			return -1;
		
		if(Math.abs(left-right)>1)
			return -1;
		
		return 1+Math.max(left, right);
	}
	
	static Map<Integer,List<Integer>> map = new TreeMap<>();
	
	private static void verticalSum(MyTreeNode root, int i)
	{
		//System.out.println("i = "+i+" d = "+root.data);
		if(map.containsKey(i))
		{
			map.get(i).add(root.data);
		}
		else{
			List<Integer> list= new ArrayList<>();
			list.add(root.data);
			map.put(i, list);
		}
		if(root.left!=null)
		{
			verticalSum(root.left, i-1);
		}
		if(root.right!=null)
		{
			verticalSum(root.right, i+1);
		}
	
	}
	
	private static void verticalOrder(MyTreeNode root, int i)
	{
		//System.out.println("i = "+i+" d = "+root.data);
		if(map.containsKey(i))
		{
			map.get(i).add(root.data);
		}
		else{
			List<Integer> list= new ArrayList<>();
			list.add(root.data);
			map.put(i, list);
		}
		if(root.left!=null)
		{
			verticalSum(root.left, i-1);
		}
		if(root.right!=null)
		{
			verticalSum(root.right, i+1);
		}
	
	}
}
