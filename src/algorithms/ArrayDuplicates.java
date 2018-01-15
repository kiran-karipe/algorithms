package algorithms;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDuplicates {
	
	public ArrayList<Integer> findDuplicates(int[] nums) {
       HashSet<Integer> set = new HashSet<Integer>();
       HashSet<Integer> set1 = new HashSet<Integer>();
       
       for(int i=0; i<nums.length; i++) {
    	   if(!set.contains(nums[i])) {
    		   set.add(nums[i]);
    	   } else {
    		   set1.add(nums[i]);
    	   }
       }
       
       ArrayList<Integer> arr1 = new ArrayList<Integer>(set1);
       return  arr1;
    }
	
	public static void main(String args[]) {
		ArrayDuplicates ad = new ArrayDuplicates();
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(ad.findDuplicates(nums));
	}
}
