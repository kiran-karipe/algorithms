package algorithms;

public class FibonacciDP {
	final int MAX = 100;
	final int NIL = -1;
	
	//Using Memoization (Top Down) 
	
	int[] lookup = new int[MAX];
	//initializing lookup array with -1
	void initialize() {
		for(int i=0; i<MAX; i++) {
			lookup[i] = NIL;
		}
	}
	//inserting values to the lookup array and returning the result
	public int fib(int n) {
		if(lookup[n] == NIL) {
			if(n <= 1) {
				lookup[n] = n;
			} else {
				lookup[n] = fib(n-1) + fib(n-2);
			}
		} 
		return lookup[n];
	}
	
	public static void main(String args[]) {
		FibonacciDP fibDp = new FibonacciDP();
		int n = 7;
		fibDp.initialize();
		System.out.println(fibDp.fib(n));
	}
}
