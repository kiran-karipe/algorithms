package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		ArrayList arry = new ArrayList();
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				arry.add(i);
			}
		}
		
		System.out.println("zero positions" + arry);
		
		for(int j=0; j<arry.size(); j++) {
			int position = (Integer)arry.get(j) - j+1;
			System.out.println("position = " + position);
			for(int k=position - 1; k+1<nums.length; k++) {
				if(k<0) {
					nums[k+1] = nums[k+2];
				}
				nums[k] = nums[k+1];
			}
			nums[nums.length - 1] = 0;
		}
		System.out.println("moved positions" + Arrays.toString(nums));
	}
	
	public static void main(String args[]) {
		MoveZeroes mz = new MoveZeroes();
		int[] nums = { 1, 2, 0, 3};
		mz.moveZeroes(nums);
	}
}
