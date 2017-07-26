package algorithms;

import java.util.Arrays;
public class CustomerShopper {
	boolean[] delivery(int[] order, int[][] shoppers) {
	    int i = 0;
	    int k = 0;
	    boolean[] result = new boolean[shoppers.length];
	    while(i < shoppers.length && k < 2) {
	        double mins = ((double)(order[0] + shoppers[i][0]) / shoppers[i][1]);
	        System.out.println(mins);
	        if((mins + shoppers[i][2]) > order[1] && (mins + shoppers[i][2]) < (order[1] + order[2])) {
	            result[k] = true;
	            k++;
	        } else { 
	            result[k] = false;
	            k++;
	        }
	        i++;
	    }
	    
	    return result;
	}

	public static void main(String args[]) {
		CustomerShopper cs = new CustomerShopper();
		int[] order = {100, 4, 3};
		int[][] shoppers = {{100,33,1}};
		System.out.println(Arrays.toString(cs.delivery(order, shoppers)));
	}
}
