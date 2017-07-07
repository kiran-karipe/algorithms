package algorithms;

import java.util.Arrays;
public class TwoSumSorting {
	public int[] findTwoSum(int[] nums, int target) {
		int[] b = new int[2];
		int[] nums1 = MergeSort.mergeSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums1));
		/*for(int i=0; i<nums.length; i++) {
			int j = i + 1;
			while(j < nums.length) {
				if(nums[i] + nums[j] == target) {
					b[0] = i;
					b[1] = j;
					return b;
				}
				j++;
			}
		}*/
		for(int i=0; i<nums1.length; i++) {
			int result = target - nums1[i];
			int low = 0, high = nums1.length;
			int mid = 0;
			while(low <= high) {
				mid = (low + high) / 2;
				if(result < nums1[mid]) {
					if(high == mid) {
						break;
					}
					high = mid;
				} else {
					if(low == mid) {
						break;
					}
					low = mid;
				}
			}
			System.out.println(nums1[mid]);
			
		}
		return b;
	}
	
	public static void main(String args[]) {
		TwoSumSorting ts = new TwoSumSorting();
		//MergeSort ms = new MergeSort();
		int[] nums = {2,7,11,15};
		
		int target = 9;
		System.out.println(Arrays.toString(ts.findTwoSum(nums, target)));
	}
}
