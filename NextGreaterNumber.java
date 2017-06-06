package algorithms;

import java.util.Arrays;

public class NextGreaterNumber {

	public int[] nextGreaterElement(int[] findNums,int[] nums) {
		
		for(int i=0; i<findNums.length; i++) {
			for(int j=0; j < nums.length ; j++) {
				if(findNums[i] == nums[j]) {
					if(j+1 < nums.length && nums[j+1] > nums[j] ) {
						findNums[i] = nums[j+1];
						break;
						//System.out.println(Arrays.toString(findNums));
					} else {
						findNums[i] = -1;
						//System.out.println(Arrays.toString(findNums));
					}
				} 
			}
		}
		System.out.println(Arrays.toString(findNums));
		return findNums;
	}
	
	public static void main(String args[]) {
		NextGreaterNumber ngn = new NextGreaterNumber();
		int[] findNums = {4, 1, 2};
		int[] nums = {1, 3, 4, 2};
		System.out.println(ngn.nextGreaterElement(findNums, nums));
		
		int[] findNums2 = {1,2,4};
		int[] nums2 = {1,2,3,4};
		System.out.println(ngn.nextGreaterElement(findNums2, nums2));
		
	}
	
}
