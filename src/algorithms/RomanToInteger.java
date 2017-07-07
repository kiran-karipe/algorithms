package algorithms;

import java.util.HashMap;

public class RomanToInteger {
	public int toInterger(String s) {
		if(s.length() == 0) {
			return 0;
		}
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				if(i+1 < s.length()) {
					if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
						count = count - map.get(s.charAt(i));
					} else {
						count = count + map.get(s.charAt(i));
					}
				} else {
					count = count + map.get(s.charAt(i));
				}
				
			}
		}
		return count;
	}
	
	public static void main(String args[]) {
		RomanToInteger roman = new RomanToInteger();
		System.out.println(roman.toInterger("MMMCMXCIX"));
	}
}
