package algorithms;

public class UglyNumber {

	public static boolean uglyNum(int num) {
		int[] n = {5};
		if(num>0) {
		if(num == 1) {
			return true;
		}
		for(int i=0; i<n.length; i++) {
			if(num % n[i] == 0)  {
				return true;
				}
			}
		}
	
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println("number is" + uglyNum(-14));
	}
 }
