package algorithms;

import java.util.Arrays;
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int insert = 0;
		for(int current = 0; current<nums.length; current++) {
			if(nums[current] != val) {
				nums[insert] = nums[current];
				insert++;				
			}
		}
		System.out.println(Arrays.toString(nums));
		return insert;
	}
	
	public static void main(String args[]) {
		RemoveElement remove = new RemoveElement();
		int[] nums = {2,2,3,4,3,5,3,2};
		System.out.println(remove.removeElement(nums, 3));
	}
}
