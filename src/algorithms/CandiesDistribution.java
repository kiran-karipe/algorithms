package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class CandiesDistribution {
	
	public int distributeCandies(int[] candies) {
		HashMap sister = new HashMap();

		for(int i=0; i<candies.length; i++) {
			if(!sister.containsValue(candies[i])) {
				sister.put(i, candies[i]);
			}
		}
		
		return (sister.size() > candies.length / 2) ? candies.length / 2 : sister.size();
	}
	
	public static void main(String args[]) {
		CandiesDistribution cd = new CandiesDistribution();
		int[] candies = {1, 1, 3, 4, 5, 6};
		System.out.println(cd.distributeCandies(candies));
	}

}
