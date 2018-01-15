package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum2 {
	public ArrayList<ArrayList<Integer>> twoSum(int[] nums) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(nums);
		int a = 0;
		int b = nums.length - 1;
		
		while(a < b) {
			if(nums[a] + nums[b] == 0) {
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				list1.add(nums[a]);
				list1.add(nums[b]);
				list.add(list1);
				a++; 
				b--;
			} else if((nums[a] + nums[b]) < 0){
				a++;
			} else {
				b--;
			}
		}
		int i = 4;
		int j = 1;
		int k = 0;
		
		for(i = 0; i < 3; i++) {
			k += j;
			j = 1 - j;
		}
		
		System.out.println(k);
		return list;
	}
	
	public static void main(String args[]) {
		TwoSum2 ts = new TwoSum2();
		int[] nums = {-1,0,1,2,-1,-4,4,-2,0};
		System.out.println(ts.twoSum(nums));
	}
}
