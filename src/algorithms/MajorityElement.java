package algorithms;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		
		for(int i=0; i<nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}
		int element = 0, maxCount = 0;
		for(int i=0; i<nums.length; i++) {
			int count = map.get(nums[i]);
			if( count >= nums.length / 2 && count > maxCount) {
				element = nums[i];
				maxCount = count;
			}
		}

		return element;
	}
	
	public static void main(String args[]) {
		MajorityElement element = new MajorityElement();
		int[] nums = {1,2};
		System.out.println(element.majorityElement(nums));
	}
}
