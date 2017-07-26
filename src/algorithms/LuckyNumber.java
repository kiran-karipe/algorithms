package algorithms;

public class LuckyNumber {
	public boolean isLucky(int n) {
		int noOfDigits = 0;
	    int x = n;
	    while(x > 0) {
	        x = x / 10;
	        noOfDigits++;
	    }
	    System.out.println(noOfDigits);
	    int firstHalf = 0;
	    int secondHalf = 0;
	    int noOfSecondHalfDigits = noOfDigits;
	    while(noOfSecondHalfDigits > noOfDigits / 2) {
	    	secondHalf = secondHalf + (n % 10);
	        n = n / 10;
	        noOfSecondHalfDigits--;
	    }
	    noOfDigits = noOfSecondHalfDigits;
	    while(noOfDigits > 0) {
	    	firstHalf = firstHalf + (n % 10);
	    	n = n / 10;
	        noOfDigits--;
	    }
	    System.out.println("First Half :" + firstHalf + " Second Half :" + secondHalf);
	    if(firstHalf != secondHalf) {
	    	return false;
	    }

		return true;
	}
	
	public static void main(String args[]) {
		LuckyNumber lucky = new LuckyNumber();
		System.out.println(lucky.isLucky(22));
	}
}
