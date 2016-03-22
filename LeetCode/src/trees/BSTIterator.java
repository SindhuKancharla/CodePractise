package trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BSTIterator {

	public static void main(String[] args) {

		BSTNode ll = new BSTNode(2);
		BSTNode lr = new BSTNode(5);
		BSTNode l = new BSTNode(ll,lr,4);
		
		BSTNode rl = new BSTNode(7);
		BSTNode rr = new BSTNode(10);
		BSTNode right = new BSTNode(rl,rr,9);
		
		BSTNode root = new BSTNode(l,right,6);
		
		BSTIterator i = new BSTIterator(root);
		
		while (i.hasNext()) 
			System.out.println(i.next());
	}

	    List<Integer> list = new ArrayList<>();
	    Iterator<Integer> it;
	    
	    public void inorder(BSTNode root)
	    {
	        if(root!=null)
	        {
	            inorder(root.right);
	            list.add(root.val);
	            inorder(root.left);
	        }
	    }
	    
	    public BSTIterator(BSTNode root) {
	        inorder(root);
	        it = list.iterator();
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return it.hasNext();
	    }

	    /** @return the next smallest number */
	    public int next() {
	    	if(it.hasNext())
	    		return it.next();
	    	else
	    		return -1;
	    }
}

