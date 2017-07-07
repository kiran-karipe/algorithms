package algorithms;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix extends Graph {
	private int[][] adjMatrix;

	public void implementAddVertex() {
		int v = getVertices();
		if(v >= adjMatrix.length) {
			int[][] newAdjMatrix = new int[v * 2][v * 2];
			for(int i=0; i<adjMatrix.length; i++) {
				for(int j=0; j<adjMatrix.length; j++) {
					newAdjMatrix[i][j] = adjMatrix[i][j];
				}
			}
			adjMatrix = newAdjMatrix;
		}
		for(int i=0; i<adjMatrix[v].length; i++) {
			adjMatrix[v][i] = 0;
		}
	}
	
	public void implementAddEdge(int v, int w) {
		adjMatrix[v][w] = 1;
	}
	
	public List<Integer> getNeighbors(int v) {
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		
		for(int i=0; i<getVertices(); i++) {
			if(adjMatrix[v][i] != 0) {
				neighbors.add(i);
			}
		}
		return neighbors;
		
	}
	public static void main(String args[]) {
		GraphAdjMatrix matrix = new GraphAdjMatrix();
		matrix.addVertex();
		matrix.addVertex();
		matrix.addVertex();
		matrix.addVertex();
		matrix.addVertex();
		matrix.addEdge(0, 1);
		matrix.addEdge(2, 3);
	}
}
