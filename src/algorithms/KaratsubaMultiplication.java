package algorithms;

public class KaratsubaMultiplication {
	
	private int x, y;
	int z = 10;
	public KaratsubaMultiplication(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int a, b, c, d;
	public void multiply() {
		int length = String.valueOf(1000).length();
		
			//a = x / (int)Math.pow(z,length / 2);
			//b = x % (int)Math.pow(z,length / 2);
			
			a = x / 100;
			b = x % 100;
			
			System.out.println(a);
			System.out.println(b);
			
			//c = y / (int)Math.pow(z,length / 2);
			//d = y % (int)Math.pow(z,length / 2);
			
			c = y / 100;
			d = y % 100;
			
			System.out.println(c);
			System.out.println(d);
			
			int step1 = a * c;
			int step2 = b * d;
			int step3 = (a + b) * (c + d);
			int step4 = step3 - step2- step1;
			int result = (step1 * 10000) + (step4 * 100) + step2;
			System.out.println("final result: " + result);
		
	}
	
	public static void main(String[] args) {
		
		KaratsubaMultiplication km = new KaratsubaMultiplication(56, 12);
		
		km.multiply();
	}
}
