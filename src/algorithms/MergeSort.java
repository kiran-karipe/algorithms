package algorithms;

import java.util.Arrays;

public class MergeSort {

	int[] array;
	
	public static int[] mergeSort(int[] a, int start, int end) {
		System.out.println("mergeSort: Array: " + Arrays.toString(a) + "; start: " + start + "; end:" + end);
		if(start >= end) {
			return Arrays.copyOfRange(a, start, end+1);
		}

		int[] arry1 = mergeSort(a, start, (start+end)/2); // 0-0, 1-1, 2-2, 3-3
		int[] arry2 = mergeSort(a, ((start+end)/2)+1, end); // 4-4, 5-5, 6-6, 7-7
		
		return merge(arry1, arry2);
	}
	
	public static int[] merge(int[] arry1, int[] arry2) {
		System.out.println("merge: Array1: " + Arrays.toString(arry1) + " Array2: " + Arrays.toString(arry2));

		int length = arry1.length + arry2.length;
		int[] result = new int[length];
		
		int p1 = 0, p2 = 0, counter = 0;
		while(counter < length) {
			if(arry2.length <= p2) {
				result[counter] = arry1[p1];
				p1++;
			} else if (arry1.length <= p1) {
				result[counter] = arry2[p2];
				p2++;
			} else if (arry1[p1] < arry2[p2]) {
				result[counter] = arry1[p1];
				p1++;
			} else {
				result[counter] = arry2[p2];
				p2++;
			}
			counter++;
		}
		
		return result;
	}

	public static void main(String[] arg) {
		//int[] a1 = {1,5,9};
		//int[] a2 = {2,3,4,6,10};
		int[] a = {1,9,2,5,7,3,6,8,0};
//		System.out.println(Arrays.toString(Arrays.copyOfRange(a,2,3)));
		//MergeSort m = new MergeSort();
		System.out.println(Arrays.toString(mergeSort(a, 0, a.length-1)));		
	}
}
