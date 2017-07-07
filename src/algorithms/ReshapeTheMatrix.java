package algorithms;

import java.util.Arrays;

public class ReshapeTheMatrix {
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		
		System.out.println(Arrays.deepToString(nums));

		return nums;
	}
	
	public static void main(String args[]) {
		ReshapeTheMatrix rm = new ReshapeTheMatrix();
		int nums[][] = {{1, 2},{3, 4}};
		System.out.println(rm.matrixReshape(nums, 1, 4));
	}

	
}
