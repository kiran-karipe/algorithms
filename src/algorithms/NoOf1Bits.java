package algorithms;

public class NoOf1Bits {

	public static int hammingWeight(int n) {
		int count = 0;
		while(n>0) {
			if(n % 2 == 1) {
				count++;
			}
			n = n/2;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("no of 1 bits " + hammingWeight(2147483647));
	}
}
