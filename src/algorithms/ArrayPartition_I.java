package algorithms;

import java.util.HashSet;
import java.util.ArrayList;

public class ArrayPartition_I {
	
	public int arrayPairSum(int[] nums) {
//		HashSet<Integer> set = new HashSet<Integer>();
//		for(int i=0; i<nums.length; i++) {
//			set.add(nums[i]);
//		}
//		
//		System.out.println(set);
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++) {
			arr1.add(nums[i]);
		}
		
		System.out.println(arr1);
		int count = 0;
		int i = 0;
		while(i < nums.length) {
			count += arr1.get(i);
			i += 2;
		}
		
		return count;
    }
	
	public static void main(String args[]) {
		ArrayPartition_I ap = new ArrayPartition_I();
		int[] nums = {-3,-7,-4,6,2,8};
		System.out.println(ap.arrayPairSum(nums));
	}
}
