package algorithms;
import java.util.Arrays;

public class MoveToEnd {

	public static void main(String[] args) {
		int[] arr = {0,1,2,0,3,4,0,5,0,6};
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				count++;
			}
			else {
				arr[i - count] = arr[i];
			}
		}
		for(int i=arr.length - count; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
