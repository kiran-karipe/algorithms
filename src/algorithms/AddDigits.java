package algorithms;

public class AddDigits {

	public int addDigits(int num) {
		while(true) {
		if(num/10 > 0) {
			num = (num/10) + (num%10);
		} else {
			return num;
		}
		addDigits(num); 
		}
	}
	
	public static void main(String[] args) {
		AddDigits ad = new AddDigits();
		System.out.printf("sum of digits %d", ad.addDigits(1234));
	}
}
