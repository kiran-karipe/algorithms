package algorithms;

public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 1) {
				count = count + 1;
				if(count > max) {
					max = count;
				}
			} else {
				if(count > max) {
					max = count;
				}
				count = 0;
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
		int[] nums = {1,0,0,0,0,0,0};
		System.out.println(mco.findMaxConsecutiveOnes(nums));
	}
}
