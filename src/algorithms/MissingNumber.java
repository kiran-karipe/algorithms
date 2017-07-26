package algorithms;


public class MissingNumber {
	public int missingNumberFromArray(int[] nums) {
		int[] nums1 = new int[nums.length + 1];
		
		for(int i=0; i<nums1.length; i++) {
			nums1[i] = -1;
		}
		
		for(int i=0; i<nums.length; i++) {
			nums1[nums[i]] = nums[i];
		}
		
		for(int i=0; i<nums1.length; i++) {
			if(nums1[i] == -1) {
				return i;
			}
		}
		
		return nums1.length;
	}
	
	public static void main(String args[]) {
		MissingNumber number = new MissingNumber();
		int[] nums = {4,3,2,1};
		System.out.println(number.missingNumberFromArray(nums));
	}
}
