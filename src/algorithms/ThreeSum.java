package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
		
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			
			while(j < k) {
				if((nums[i] + nums[j] + nums[k]) == 0) {
					ArrayList<Integer> arr = new ArrayList<Integer>();
					arr.add(nums[i]);
					arr.add(nums[j]);
					arr.add(nums[k]);
					if(!list1.contains(arr)) {
						list1.add(arr);
					}
					j++;
					k--;
				} else if((nums[i] + nums[j] + nums[k]) < 0) {
					j++;
				} else {
					k--;
				}
			}
		}
		
		return list1;
	}
	
	public static void main(String args[]) {
		ThreeSum ts = new ThreeSum();
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(ts.threeSum(nums));
	}
}
