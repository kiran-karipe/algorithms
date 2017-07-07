package algorithms;
public class PowerOfFour {
	
	public static boolean fourPower(int n) {
		
		while(n>1 || n<-1 ) {
			if(n%4 == 0) {
				n = n/4;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println("num is " + fourPower(-2147483648));
	}
}
