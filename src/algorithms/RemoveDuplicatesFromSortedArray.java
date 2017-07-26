package algorithms;

import java.util.Arrays;
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums.length <= 1) {
			return nums.length;
		}
		int prev = 0;
		int insert = 1;
		for(int current=1; current<nums.length; current++) {
			
			if(nums[current] != nums[prev] ) {
				nums[insert] = nums[current];
				insert++;
				prev = current;
			}
		}
		System.out.println(Arrays.toString(nums));
		return insert;
	}
	
	public static void main(String args[]) {
		RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();
		int[] nums = {1,1,1,1,2,2,2,3,3,3,3,4,4};
		System.out.println(remove.removeDuplicates(nums));
		int[] nums1 = {1,2};
		System.out.println(remove.removeDuplicates(nums1));
	}
}
