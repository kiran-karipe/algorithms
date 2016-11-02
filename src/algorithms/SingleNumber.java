package algorithms;

public class SingleNumber {
	int result = 0;
	public int singleNumber(int[] array) {
	if(array.length ==1) {
		return array[0];
	}
	
	for(int i=0; i<array.length; i++) {
		result = result ^ array[i];
	}
		return result;
		
	}
	
	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] array = { 4, 5, 1, 1, 5};
		System.out.println(sn.singleNumber(array));
	}
}