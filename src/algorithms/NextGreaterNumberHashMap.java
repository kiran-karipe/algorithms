package algorithms;

import java.util.HashMap;

public class NextGreaterNumberHashMap {

	public int[] nextGreaterNumber(int[] findNums, int[] nums) {
		HashMap hm = new HashMap();
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<=nums.length; j++) {
				if(j+1 <= nums.length  && nums[i] < nums[j]) {
					hm.put(nums[i], nums[j]);
					break;
				} else {
					hm.put(nums[i], -1);
				}
			}
		}
		
		for(int j=0; j<findNums.length; j++) {
			if(hm.containsKey(findNums[j])) {
				findNums[j] = Integer.parseInt(hm.get(findNums[j]).toString());
				System.out.println(findNums[j]);
			}
		}
		return findNums;
	}
	
	public static void main(String args[]) {
		NextGreaterNumberHashMap ngn = new NextGreaterNumberHashMap();
		int[] findNums = {4, 1, 2};
		int[] nums = {1, 3, 4, 2};
		System.out.println(ngn.nextGreaterNumber(findNums, nums));
		
		int[] findNums2 = {1,2,3,4,5};
		int[] nums2 = {6,5,4,3,2,1,7};
		System.out.println(ngn.nextGreaterNumber(findNums2, nums2));
		
	}
}
