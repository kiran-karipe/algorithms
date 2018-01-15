package algorithms;

public class HouseRobber_II {
	public int robHouse_II(int[] nums) {
		int maxWithoutPrevHouse = 0,
			maxWithPrevHouse = 0;
		boolean initial = false;
		int initialValue =  nums[0];
		for(int i=0; i<nums.length; i++) { 
			int withCurrent = maxWithoutPrevHouse + nums[i];
			int withoutCurrent = maxWithPrevHouse;		

			if(withCurrent > withoutCurrent) {
				maxWithPrevHouse = withCurrent;
				initial = true;
			} else {
				initial = false;
			}
			maxWithoutPrevHouse = withoutCurrent;
		}
		if(initial == true) {
			maxWithPrevHouse = maxWithPrevHouse - initialValue;
		}
		
		if(maxWithPrevHouse > maxWithoutPrevHouse) {
			return maxWithPrevHouse;
		} else {
			return maxWithoutPrevHouse;
		}
	}
	
	public static void main(String args[]) {
		HouseRobber_II hr = new HouseRobber_II();
		int[] nums = {10,20,30,40,50};
		System.out.println(hr.robHouse_II(nums));
	}
}
