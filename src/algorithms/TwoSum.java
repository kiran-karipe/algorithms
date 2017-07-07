package algorithms;


import java.util.Arrays;

public class TwoSum {
	public int[] findTwoSum(int[] nums, int target) {
		int[] b = new int[2];
		for(int i=0; i<nums.length; i++) {
			int j = i + 1;
			while(j < nums.length) {
				if(nums[i] + nums[j] == target) {
					b[0] = i;
					b[1] = j;
					return b;
				}
				j++;
			}
		}
		return b;
	}
	
	public static void main(String args[]) {
		TwoSum ts = new TwoSum();
		int[] nums = {1,10,0,2,3,0};
		int target = 0;
		System.out.println(Arrays.toString(ts.findTwoSum(nums, target)));
	}
}

//{0, 1, 2, 6, 6, 3, 10};