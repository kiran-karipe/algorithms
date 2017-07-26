package algorithms;

import java.util.Arrays;
public class MatrixElementSum {
	int matrixElementsSum(int[][] matrix) {
	    int j = 0;
	    int sum = 0;
	    while(j < matrix[0].length) {
	    	int i = 0;
	    	while(i<matrix.length) {
		        if(matrix[i][j] == 0) {
		            if(i+1 < matrix.length) {
		            	matrix[i+1][j] = 0;
		            }
		        } else {
		        	sum = sum + matrix[i][j];
		        }
		        i++;
		    }
	    	j++;
	    }
	    System.out.println(Arrays.deepToString(matrix));
	    return sum;
	}
	
	public static void main(String args[]) {
		MatrixElementSum mes = new MatrixElementSum();
		int[][] matrix = {{0, 1, 1, 2},{1, 5, 0, 0},{2, 0, 3, 3}};
		int[][] matrix1 = {{1,1,1,0}, {0,5,0,1}, {2,1,3,10}};
		System.out.println(mes.matrixElementsSum(matrix));
		System.out.println(mes.matrixElementsSum(matrix1));
	}
}
