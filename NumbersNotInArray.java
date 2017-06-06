package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersNotInArray {

	public List<Integer> findNumbersNotInArray(int[] nums) {
		ArrayList<Integer> arr1 = new ArrayList();
		int i=0;
		int n = nums.length;
		while(i < n)  {
			if(nums[i] != 0 && (nums[i] - 1) < n && nums[nums[i] - 1] != 0) {
				int temp = nums[i];
				nums[i] = nums[nums[i] - 1];
				nums[temp - 1] = 0;
			} else {
				i++;
			}
		}
		
		for(int j=0; j<nums.length; j++) {
			if(nums[j] != 0) {
				arr1.add(j + 1);
			}
		}
		return arr1;
	}
	
	public static void main(String args[]) {
		NumbersNotInArray nna = new NumbersNotInArray();
		int[] nums = {1,3,4};
		System.out.println(nna.findNumbersNotInArray(nums));
	}
}
