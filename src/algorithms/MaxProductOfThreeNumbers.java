package algorithms;

import java.util.Arrays;
public class MaxProductOfThreeNumbers {
	public int maxProduct(int[] nums) {
		Arrays.sort(nums);
		int index = nums.length - 1;
		int maxProduct = nums[index] * nums[index - 1] * nums[index - 2];
		if(nums[index] * nums[0] * nums[1] > maxProduct) {
			maxProduct = nums[index] * nums[0] * nums[1];
		}
		return maxProduct;
	}
	
	public static void main(String args[]) {
		MaxProductOfThreeNumbers product = new MaxProductOfThreeNumbers();
		int[] nums = {1,2,3,4};
		System.out.println(product.maxProduct(nums));
	}
}
