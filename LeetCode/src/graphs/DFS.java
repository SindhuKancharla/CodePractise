package graphs;

public class DFS {

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
 
		depthFirstSearch(n1, 5);
	}

	private static void depthFirstSearch(GraphNode root, int x) {

		root.visited = true;
		if(root.data==x)
		{
			System.out.println("Found "+root);
			return;
		}
		
		GraphNode[] neighbors = root.neighbors;
		for(GraphNode g : neighbors)
		{
			if(!g.visited)
			{
				System.out.print(g + " ");
				g.visited = true;
				if(g.data == x)
				{
					System.out.println("\nFound "+g);
					break;
				}
				
				depthFirstSearch(g, x);
			}
		}
	}

}
