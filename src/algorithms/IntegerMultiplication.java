package algorithms;

public class IntegerMultiplication {

	private int x ,y;
	int n = 0;
	int i = 1;
	
	public IntegerMultiplication(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void multiply() {
		while(y>0) {
			int z = y % 10;
			int k = x * z;
			
			n = n + (k * i);
			System.out.println("value :" + k * i);
			i = i * 10;
			y = y / 10;
		}
		System.out.println("final multiplication value :" + n);

	}
	public static void main(String[] args) {
		
		IntegerMultiplication im = new IntegerMultiplication(345, 678);
		
		im.multiply();
	}
}
