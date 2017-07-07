package algorithms;

import java.util.HashMap;

// Given two strings, write a method to decide if one is permutation of the other.
public class StringPermutation {
	public boolean checkPermutation(String s1, String s2) {
//		return true if both are null
		if(s1 == null && s2 == null) {
			return true;
		}
//		return false if two strings have different lengths
		if(s1.length() != s2.length()) {
			return false;
		} 
//		return true if two strings are empty
		if(s1 == "" && s2 == "") {
			return true;
		}
		boolean result = false;
		
//		two hashmaps one for each string with key as characters in respective strings
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i=0; i<s1.length(); i++) {
			char current = s1.charAt(i); 
			if(map1.get(current) != null) {
				map1.put(current, map1.get(current) + 1);
			} else {
				map1.put(current, 1);

			}
		}
		
		for(int i=0; i<s2.length(); i++) {
			char current = s2.charAt(i); 
			if(map2.get(current) != null) {
				map2.put(current, map2.get(current) + 1);
			} else {
				map2.put(current, 1);

			}
		}
		
		System.out.println(map1);
		System.out.println(map2);
		
		for(int i=0; i<s1.length(); i++) {
			char current = s1.charAt(i);
			if(map2.containsKey(current)) {
				if(map1.get(current) == map2.get(current)) {
					result = true;
				} else {
					result = false;
					return result;
				}
			} else {
				result = false;
				return result;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		StringPermutation sp = new StringPermutation();
		System.out.println(sp.checkPermutation("taco cat", " coatact"));
	}
}
