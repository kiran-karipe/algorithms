package algorithms;

import java.util.Arrays;

public class CountingBits {
	public int[] countBits(int num) {
		int[] bitsCount = new int[num + 1];
		bitsCount[0] = 0;
		bitsCount[1] = 1;
		for(int i = 2; i <= num; i++) {
			int count = 1;
			int j = i;
			while(j > 1) {
				if(j % 2 == 1) {
					count += 1;
				} 
				j = j / 2;
				System.out.println(j);
			}
			bitsCount[i] = count;
		}
		return bitsCount;
	}
	
	public static void main(String args[]) {
		CountingBits cb = new CountingBits();
		System.out.println(Arrays.toString(cb.countBits(5)));
	}
}
