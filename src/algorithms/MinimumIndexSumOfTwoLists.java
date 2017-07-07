package algorithms;

import java.util.ArrayList;

public class MinimumIndexSumOfTwoLists {

	public String[] findRestaurant(String[] list1, String[] list2) {
		int leastCount = list1.length + list2.length;
		ArrayList<String> leastString = new ArrayList<String>();
		
		for(int i=0; i<list1.length; i++) {
			for(int j=0; j<list2.length; j++) {
				if(list1[i].equals(list2[j])) {
					if((i+j) <= leastCount) {
						leastCount = i+j;
						leastString.add(list1[i]);
					}
				}
			}
		}
		//System.out.println(leastString);
		String[] list = new String[leastString.size()];
		return leastString.toArray(list);
	}
	
	public static void main(String args[]) {
		MinimumIndexSumOfTwoLists mistl = new MinimumIndexSumOfTwoLists();
		String[] list1 = {"Shogun","The Burger King", "KFC" };
		String[] list2 = {"The Burger King","Shogun" };
		
		System.out.println(mistl.findRestaurant(list1, list2));
 	}
}
