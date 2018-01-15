package algorithms;

public class HouseRobber_I {
	public int robHouse(int[] nums) {
		int maxWithoutPrevHouse = 0,
			maxWithPrevHouse = 0;
		
		for(int i=0; i<nums.length; i++) {
			int withCurrent = maxWithoutPrevHouse + nums[i];
			int withoutCurrent = maxWithPrevHouse;		
//			maxWithoutPrevHouse = Math.max(maxWithoutPrevHouse, withoutCurrent);
//			maxWithPrevHouse = Math.max(maxWithPrevHouse, withCurrent);

			if(withCurrent > withoutCurrent) {
				maxWithPrevHouse = withCurrent;
//				System.out.println(maxWithPrevHouse);
			}
			maxWithoutPrevHouse = withoutCurrent;
		}
//		return Math.max(maxWithoutPrevHouse, maxWithPrevHouse);
		return maxWithPrevHouse;
	}

	public static void main(String args[]) {
		HouseRobber_I hr = new HouseRobber_I();
		int[] nums = {100,10,20,30,40,50};
		System.out.println(hr.robHouse(nums));

		int[] nums1 = {100,60,50,30,5,40,50,10};
		System.out.println(hr.robHouse(nums1));

		int[] nums2 = {100,10,10,30,10,20};
		System.out.println(hr.robHouse(nums2));		

		int[] nums3 = {1,1,1,1,1,1,1};
		System.out.println(hr.robHouse(nums3));		

		int[] nums4 = {1};
		System.out.println(hr.robHouse(nums4));		
	}
}
