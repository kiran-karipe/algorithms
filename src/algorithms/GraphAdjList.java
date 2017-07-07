package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class GraphAdjList extends Graph{
	private Map<Integer, ArrayList<Integer>> adjListMap;
	
	public void implementAddVertex() {
		int v = getVertices();
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		adjListMap.put(v, neighbors);
	}
	
	public void implementAddEdge(int v, int w) {
		(adjListMap.get(v)).add(w);
	}
	
	public List<Integer> getNeighbors(int v) {
		return new ArrayList<Integer>(adjListMap.get(v));
	}
	
}
