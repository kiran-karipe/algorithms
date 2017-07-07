package algorithms;

public abstract class Graph {
	private int numOfVertices;
	private int numOfEdges;
	
	public Graph() {
		numOfVertices = 0;
		numOfEdges = 0;
	}
	
	public int getVertices() {
		return numOfVertices;
	}
	
	public int getEdges() {
		return numOfEdges;
	}
	
	public void addVertex() {
		implementAddVertex();
		numOfVertices++;
	}
	
	public void addEdge(int vertex1, int vertex2) {
		implementAddEdge(vertex1, vertex2);
		numOfEdges++;
	}

	public abstract void implementAddVertex();
	public abstract void implementAddEdge(int vertex1,int vertex2);
}
