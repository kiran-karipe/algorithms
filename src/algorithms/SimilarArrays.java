package algorithms;

import java.util.ArrayList;

public class SimilarArrays {
	boolean areSimilar(int[] a, int[] b) {
	    if(a.length != b.length) {
	        return false;
	    }
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=0; i<a.length; i++) {
	        list.add(a[i]);
	    }
	    
	    for(int i=0; i<b.length; i++) {
	        if(!list.contains(b[i])) {
	            return false;
	        }
	    }
	    int[] indexes = new int[2];
	    int j=0;
	    for(int i=0; i<a.length; i++) {
	        if(a[i] != b[i] && j < 2) {
	            indexes[j] = i;
	            j++;
	        }
	    }
	    
	    int temp = b[indexes[0]];
	    b[indexes[0]] = b[indexes[1]];
	    b[indexes[1]] = temp;
	    
	    for(int i=0; i<a.length; i++) {
	        if(a[i] != b[i]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String args[]) {
		SimilarArrays sa = new SimilarArrays();
		int[] a = {1,2,2};
		int[] b = {2,1,1};
		System.out.println(sa.areSimilar(a, b));
	}

}
