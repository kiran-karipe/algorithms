package algorithms;

public class MergeSort {
	int[] array = {5,4,1,8,7,2,6,3};
	int[] a;
	int[] b;
	public void Merge(int start, int end) {
		
		start = 0;
		end = array.length - 1;
		
		Merge(start, (start+end)/2-1);
		Merge((start+end)/2, end);
		MergeSort();
	}
	
	public void MergeSort() {
		
	}
}
