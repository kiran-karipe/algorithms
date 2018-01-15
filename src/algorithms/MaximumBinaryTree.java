package algorithms;

public class MaximumBinaryTree {
	
	public int constructMaximumBinaryTree(int[] nums) {
		
		return 0;
	}
	
	public int findLargest(int nums[]) {
		int largest = nums[0];
				
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > largest) {
				largest = nums[i];
			}
		}
		
		return largest;
	}
	public static void main(String args[]) {
		MaximumBinaryTree mbt = new MaximumBinaryTree();
		int[] nums = {3,2,1,6,0,5,7};
		System.out.println(mbt.constructMaximumBinaryTree(nums));
	}
	
}
