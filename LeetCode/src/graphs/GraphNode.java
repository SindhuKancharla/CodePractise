package graphs;

public class GraphNode {
	
	int data;
	GraphNode[] neighbors;
	boolean visited;
	
	public GraphNode(int data, GraphNode[] neighbors, boolean visited) {
		super();
		this.data = data;
		this.neighbors = neighbors;
		this.visited = visited;
	}
	
	public GraphNode(int data)
	{
		this.data = data;
	}
	
	public String toString(){
		return "value: "+ this.data; 
	}
}
