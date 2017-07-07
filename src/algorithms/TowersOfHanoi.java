package algorithms;
public class TowersOfHanoi {
	
	int[] array = {2, 4, 7, 3, 8, 1, 9, 6, 0, 5};
	
	public void towerOfHanoi() {
		int[] list = new int[array.length];
		int[] list1 = new int[array.length];
		
		list[0] = array[0];
		for(int i = 1; i < array.length - 1; i++) {
			System.out.println("array: " + array[i]);
			if(array[i] >= list[i-1] ) {
				list1[i] = array[i] ;
				System.out.println("array1: " + list[i]);
			}
			else {
				list[i-1] = array[i];
				System.out.println("array2: " + list1[i]);
			}
		}
		
		for(int j = 0; j < array.length; j++) {
			System.out.println(array[j]);

		}
		
	}
	
	public static void main(String args[]) {
		TowersOfHanoi toh = new TowersOfHanoi();
		toh.towerOfHanoi();
	}
}
