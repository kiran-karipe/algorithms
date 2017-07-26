package algorithms;

import java.util.Arrays;
public class AlternatingSums {
	public int[] alternatingSums(int[] a) {
		int[] result = new int[2];
		if(a.length == 0) {
			return result;
		}
		if(a.length == 1) {
			result[0] = a[0];
			result[1] = 0;
			return result;
		}
		result[0] = a[0];
		result[1] = a[1];
		
		for(int i=2; i<a.length; i++) {
			if(i % 2 == 0) {
				result[0] = result[0] + a[i];
			} else {
				result[1] = result[1] + a[i];
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		AlternatingSums as = new AlternatingSums();
		int[] a = {50, 60, 60, 45, 70};
		System.out.println(Arrays.toString(as.alternatingSums(a)));
	}
	
	
}
