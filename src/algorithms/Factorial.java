package algorithms;

public class Factorial {

	//int n;
	
	public int factorial(int n) {
		if(n < 0) 
			return -1;
		else if(n == 0) 
			return 1;
		else
			return n * factorial(n-1);
	}
	
	public static void main(String args[]) {
		Factorial f = new Factorial();
		System.out.println(f.factorial(5));
	}
}
