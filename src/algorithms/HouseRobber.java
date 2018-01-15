package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
public class HouseRobber {
	public int rob(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		int[] nums1 = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			nums1[i] = nums[i];
		}
		Arrays.sort(nums1);
		System.out.println(map);
		System.out.println(Arrays.toString(nums1));
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=nums1.length - 1; i >= 0; i--) {
//			System.out.println(nums1[i]);
			if(i+1 > nums1.length - 1){
				if(!set.contains(nums1[i - 1])) {
					set.add(nums[map.get(nums1[i])]);
					System.out.println(nums[i]);
				}
			}
			else if(i-1 < 0) {
				if(!set.contains(nums1[i + 1])) {
					set.add(nums[map.get(nums1[i])]);
					System.out.println(nums[i]);
				}
			}
			else {
				if(!set.contains(nums1[i - 1]) && !set.contains(nums1[i+1])) {
					set.add(nums[map.get(nums1[i])]);
					System.out.println(nums1[i]);
				}
			}
		}
		System.out.println(set);

		return 0;
	}
	
	public static void main(String args[]) {
		HouseRobber hr = new HouseRobber();
		int[] nums = {100,10,20,30,40,50};
		System.out.println(hr.rob(nums));
	}
}
