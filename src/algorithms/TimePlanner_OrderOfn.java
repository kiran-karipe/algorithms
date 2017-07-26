package algorithms;

import java.util.Arrays;

public class TimePlanner_OrderOfn {
	public int[] meetingPlannerOrderOfn(int[][] slotsA, int[][] slotsB, int duration) {
		int[] result = new int[2];
		int i=0;
		int j=0;
		
		while(i < slotsA.length && j < slotsB.length) {
			int start = Math.max(slotsA[i][0], slotsB[j][0]);
			int end = Math.min(slotsA[i][1], slotsB[j][1]);
			
			if(end - start >= duration) {
				result[0] = start;
				result[1] = start + duration;
				return result;
			}
			if(slotsA[i][1] > slotsB[j][1]) {
				j++;
			} else {
				i++;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		TimePlanner_OrderOfn planner = new TimePlanner_OrderOfn();
		int[][] slotsA = {{0, 50},{60, 120},{140, 210}};
		int[][] slotsB = {{0,15},{60,70}};
		int duration = 8;
		System.out.println(Arrays.toString(planner.meetingPlannerOrderOfn(slotsA, slotsB, duration)));
	}
}
