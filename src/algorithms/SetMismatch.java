package algorithms;

import java.util.Arrays;
import java.util.HashSet;
public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
		int[] newNums = new int[2];
		HashSet<Integer> list =new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(!list.contains(nums[i])) {
				list.add(nums[i]);
			} else {
				newNums[0] = nums[i];
			}
		}
		for(int i=1; i<=nums.length; i++) {
			if(!list.contains(i)) {
				newNums[1] = i;
				break;
			}
		}
		System.out.println(list);
		
		return newNums;
	}
	
	public static void main(String args[]) {
		SetMismatch sm = new SetMismatch();
		int[] nums = {1,2,2,4};
		System.out.println(Arrays.toString(sm.findErrorNums(nums)));
	}
}
