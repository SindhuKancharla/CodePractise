package graphs;

public class GraphNode {

	public GraphNode[] children;
	int childCount;
	boolean visited;
	int val;
	
	public GraphNode(int val) {
		this.val = val;
	}
	
	public void addChildNode(GraphNode a,int val){
		
		GraphNode[] children = a.children;
		children[childCount] = new GraphNode(val);
		children[childCount].visited = false;
		a.childCount++;

	}
	
	public GraphNode[] getChildNodes(GraphNode a){
		return a.children;
	}
}
