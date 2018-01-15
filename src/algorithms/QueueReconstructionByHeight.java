package algorithms;

import java.util.Arrays;

public class QueueReconstructionByHeight {
	
	public int[][] reconstructQueue(int[][] people) {
		int smallest = people[0][0];
		
		for(int i=1; i<people.length; i++) {
			if(smallest > people[i][0]) {
				smallest = people[i][0];
			}
		}
		
		System.out.println(smallest);
		
		return people;
    }
	
	public static void main(String args[]) {
		QueueReconstructionByHeight qrh = new QueueReconstructionByHeight();
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		System.out.println(Arrays.deepToString(qrh.reconstructQueue(people)));
	}
	
}
