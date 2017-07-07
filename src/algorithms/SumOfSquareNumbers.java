package algorithms;

public class SumOfSquareNumbers {
	public boolean judgeSquareSum(int c) {
		
		for(int i=0; i<=Math.sqrt(c) + 1; i++) {
			int n = c - (i*i);
			int j = (int) Math.sqrt(n);
			if ((i*i + j*j) == c) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		SumOfSquareNumbers ssn = new SumOfSquareNumbers();		
		for(int i=1; i < 10000; i++) {
			if(!ssn.judgeSquareSum(i*i)){
				System.out.println("Incorrect value for: " + i);
			}	
		}		
	}
}
