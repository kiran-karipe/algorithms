package algorithms;

import java.util.ArrayList;
public class ArrayQuadruplet {
	public ArrayList<ArrayList<Integer>> findArrayQuadruplet(int[] arr, int s) {
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<arr.length; i++) {
			int j = i + 1;
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			System.out.println(arr[i]);
			while(j+2 < arr.length) {
				if((arr[i]+arr[j]+arr[j+1]+arr[j+2]) == s) {
					list1.add(arr[i]);
					list1.add(arr[j]);
					list1.add(arr[j+1]);
					list1.add(arr[j+2]);
					
					list.add(list1);
					break;
//					arr1[0] = arr[i];
//					arr1[1] = arr[j];
//					arr1[2] = arr[j+1];
//					arr1[3] = arr[j+2];
//					break;
				} else {
//					System.out.println(arr[j]);
					j++;
				}
			}
		}
		return list;
	}
	
	public static void main(String args[]) {
		ArrayQuadruplet aq = new ArrayQuadruplet();
		int[] arr = {2,7,4,0,9,5,1,3};
		System.out.println(aq.findArrayQuadruplet(arr, 20));
	}
}
