package algorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class PalindromeRearranging {
	boolean palindromeRearranging(String inputString) {
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    for(int i=0; i<inputString.length(); i++) {
	        if(!map.containsKey(inputString.charAt(i))) {
	            map.put(inputString.charAt(i), 1);
	        } else {
	            map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
	        }
	    }
	    
	    System.out.println(map);
	    ArrayList<Character> list = new ArrayList<Character>();
	    for(int i=0; i<inputString.length(); i++) {
	    	if(!list.contains(inputString.charAt(i))) {
	    		list.add(inputString.charAt(i));
	    	}
	    }
	    int count = 0;
	    if(inputString.length() % 2 == 0) {
	        for(int i=0; i<inputString.length(); i++) {
	            if(map.get(inputString.charAt(i)) % 2 != 0) {
	                return false;
	            }
	        }
	    } else {
	        for(int i=0; i<list.size(); i++) {
	            if(map.get(list.get(i)) % 2 != 0) {
	            	count++;
	            	if(count > 1) {
	                    return false;
	                }
	            }
	        }
	    }
	    return true;
	}
	
	public static void main(String args[]) {
		PalindromeRearranging pr = new PalindromeRearranging();
		String str = "abbba";
		System.out.println(pr.palindromeRearranging(str));
	}
}
