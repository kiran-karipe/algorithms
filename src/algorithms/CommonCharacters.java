package algorithms;

import java.util.ArrayList;

public class CommonCharacters {
	int commonCharacterCount(String s1, String s2) {
	    ArrayList<Character> list = new ArrayList<Character>();

	    for(int i=0; i<s1.length(); i++) {
	    	list.add(s1.charAt(i));
	    }
	    System.out.println(list);
	    int count = 0;
	    for(int i=0; i<s2.length(); i++) {
	    	if(list.contains(s2.charAt(i))) {
	    		list.remove(list.indexOf(s2.charAt(i)));
	    		count++;
	    	}
	    }
	    System.out.println(list);
	  
	    return count;
	}
	
	public static void main(String args[]) {
		CommonCharacters cc = new CommonCharacters();
		System.out.println(cc.commonCharacterCount("aabdadcc", "adsocaa"));
	}
}
