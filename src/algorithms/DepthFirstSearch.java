package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DepthFirstSearch  {
	public void DFS(Node start, Node goal) {
		MyStack stack = new MyStack();
		HashSet<Node> visitedSet = new HashSet<Node>();
		HashMap<Node, Integer> parentMap = new HashMap<Node, Integer>();
		ArrayList<Node> neighbors = new ArrayList<Node>();
		Node current = null;
		stack.push(start);
		visitedSet.add(start);
		while(!stack.isEmpty()) {
			current = stack.popNode();
			neighbors.add(current);
			if( current == goal) {
				System.out.println(parentMap.put(goal, goal.data));
			}
			for(int i=0; i < neighbors.size(); i++) {
				if(!neighbors.contains(visitedSet)) {
					visitedSet.add(neighbors.get(i));
					parentMap.put(current, current.data);
					stack.push(current);
				}
			}
		}
	}
}
