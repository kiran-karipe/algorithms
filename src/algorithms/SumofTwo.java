package algorithms;

public class SumofTwo {

	public int getSum(int a, int b) {
		
		while(b!=0) {
			int carry = a&b;
			a = a^b;
			b = carry << 1;
		}
		
		return a;
	}
	
	public static void main(String args[]) {
		SumofTwo st = new SumofTwo();
		System.out.printf("Sum of Two %d", st.getSum(6, 3));
	}
}
