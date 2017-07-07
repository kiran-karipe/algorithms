package algorithms;

public class ArrayQueue {

	int[] array;
	
	
	public void enQueue(int item) {
		if(array.length == 0) {
			array[0] = item;
		}
		else  {
			int[] temp = {};
			temp[array.length - 1] = item;
		}
	}
	
	public void deQueue(int item) {
		if(array.length == 0) {
			System.out.println("no elements in array to remove");
		}
		else if(array.length == 1) {
			
		}
	}
	
	public boolean remove() {
		return true;
	}
}
