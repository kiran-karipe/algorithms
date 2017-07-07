package algorithms;

public class SingleElementFromSortedArray {

	public int singleNonDuplicate(int[] nums) {
		int mid = 0, start = 0, end = nums.length -1;
		if(nums.length % 2 == 0) {
			return -1;
		}
		
		while(end > start) {
			mid = (start + end) / 2;
			if(mid % 2 == 0) {
				if(mid == start) {
					//smid = end;
					break;
				}
				if(nums[mid] == nums[mid - 1]) {
					end = mid;
				} else {
					start = mid;
				}
			} else {
				if(mid == start) {
					mid = end;
					break;
				}
				if(nums[mid] == nums[mid - 1]) {
					start = mid;
				} else {
					end = mid;
				}
			}
		}
		
		return nums[mid];
	}
	
	public static void main(String args[]) {
		SingleElementFromSortedArray sesa = new SingleElementFromSortedArray();
		int[] nums = {1,1,2,3,3,5,5};
		System.out.println(sesa.singleNonDuplicate(nums));
	}
}
