package graphs;

import queues.MyQueue;

public class BFS {

	public static void main(String[] args) {

		GraphNode n1 = new GraphNode(1); 
		GraphNode n2 = new GraphNode(2); 
		GraphNode n3 = new GraphNode(3); 
		GraphNode n4 = new GraphNode(4); 
		GraphNode n5 = new GraphNode(5); 
 
		n1.neighbors = new GraphNode[]{n2,n3,n5};
		n2.neighbors = new GraphNode[]{n1,n4};
		n3.neighbors = new GraphNode[]{n1,n4,n5};
		n4.neighbors = new GraphNode[]{n2,n3,n5};
		n5.neighbors = new GraphNode[]{n1,n3,n4};
 
		breathFirstSearch(n1, 5);
	}

	private static void breathFirstSearch(GraphNode root, int x) {

		if(root.data==x)
			System.out.println("root ="+root.data);
		
		root.visited = true;

		MyQueue queue = new MyQueue();
		queue.enQueue(root);
		
		while(!queue.isEmpty())
		{
			GraphNode tmp = (GraphNode) queue.deQueue();
			//System.out.println(tmp.data);
			
			GraphNode[] neighbors = tmp.neighbors;
			for(GraphNode g : neighbors)
			{
				if(!g.visited)
				{
					System.out.print(g + " ");
					queue.enQueue(g);
					g.visited = true;
					
					if(g.data == x)
					{
						System.out.println("\nFound " +g);
					}
				}
			}
		}
	}

}
