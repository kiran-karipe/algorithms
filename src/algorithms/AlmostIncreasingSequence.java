package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
public class AlmostIncreasingSequence {
	boolean almostIncreasingSequence(int[] sequence) {
	    ArrayList<Integer> arry = new ArrayList<Integer>();
	    for(int i=0; i<sequence.length; i++) {
	    	arry.add(sequence[i]);
	    }
	    System.out.println(arry);
	    
	    for(int i=1; i<sequence.length; i++) {
	    	if(sequence[i] <= sequence[i-1]) {
	    		arry.remove(i - 1);
	    		break;
	    	}
	    }
	    int[] sequenceArray = new int[arry.size()];
	    for(int i=0; i<arry.size(); i++) {
	    	sequenceArray[i] = arry.get(i);
	    }
	    System.out.println(Arrays.toString(sequenceArray));
	    for(int i = 1; i<sequenceArray.length; i++) {
	        if(sequenceArray[i] <= sequenceArray[i-1]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String args[]) {
		AlmostIncreasingSequence ais = new AlmostIncreasingSequence();
		int[] sequence = {1,2,1,2};
		System.out.println(ais.almostIncreasingSequence(sequence));
	}
}
