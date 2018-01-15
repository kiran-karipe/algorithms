package algorithms;

import java.util.HashSet;

public class MissingNumberUsingSet {
	public int missingNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			set.add(nums[i]);
		}
		
		for(int i=0; i<nums.length; i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return nums.length;
	}
	
	public static void main(String args[]) {
		MissingNumberUsingSet number = new MissingNumberUsingSet();
		int[] nums = {4,2,1,0};
		System.out.println(number.missingNumber(nums));
	}
}
