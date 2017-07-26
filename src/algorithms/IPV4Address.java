package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
public class IPV4Address {
	boolean isIPv4Address(String inputString) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('0');
		list.add('1');
		list.add('2');
		list.add('3');
		list.add('4');
		list.add('5');
		list.add('6');
		list.add('7');
		list.add('8');
		list.add('9');

		System.out.println(list);
	    String[] arry = new String[4];
	    int j=0;
	    for(int i=0; i<inputString.length(); i++) {
	        if(inputString.charAt(i) != '.' && list.contains(inputString.charAt(i)) && j < arry.length) {
	             if(arry[j] != null) {
	            	 arry[j] += inputString.charAt(i);
	             } else {
	            	 arry[j] ="";
	            	 arry[j] += inputString.charAt(i);
	             }
	        } else {
	        	if(inputString.charAt(i) == '.') {
	        		j++;
	        	} else {
	        		return false;
	        	}
	        }
	       
	    }
	    System.out.println(Arrays.toString(arry));
	    
	    for(int i=0; i<arry.length; i++) {
	    	if(arry[i] != null) {
	    		int current = Integer.parseInt(arry[i]);
		    	System.out.println(current);
	    		if(current < 0 || current > 255 ) {
		    		return false;
		    	}
	    	} else {
	    		return false;
	    	}
	    }
	    return true;
	}
	
	public static void main(String args[]) {
		IPV4Address ipv4 = new IPV4Address();
		System.out.println(ipv4.isIPv4Address("0.254.255.0"));
	}
}
