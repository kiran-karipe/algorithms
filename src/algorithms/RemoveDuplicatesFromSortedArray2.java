package algorithms;

public class RemoveDuplicatesFromSortedArray2 {
	public int removeDuplicates2(int[] nums) {
		int prev = 0;
		int insert = 1;
		
		if(nums.length <= 1) {
			return nums.length;
		}
		
		for(int current = 1; current < nums.length; current++) {
			if(nums[current] != nums[prev]) {
				nums[insert] = nums[current];
				insert++;
				prev = current;
			}
		}
		
		return prev;
	}
	
	public static void main(String args[]) {
		RemoveDuplicatesFromSortedArray2 remove = new RemoveDuplicatesFromSortedArray2();
		int[] nums = {1,1,1,1,2,2,2,3,3,3,3,4,4};
		System.out.println(remove.removeDuplicates2(nums));
		int[] nums1 = {1,2};
		System.out.println(remove.removeDuplicates2(nums1));
		
	}
}
