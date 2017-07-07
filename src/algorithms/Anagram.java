package algorithms;

import java.util.HashMap;

public class Anagram {
	// public boolean isAnagram(String s, String t) {
	public static boolean isAnagram(String s, String t) {
		HashMap<Integer, Character> hmap1 = new HashMap<Integer, Character>();
		HashMap<Integer, Character> hmap2 = new HashMap<Integer, Character>();
		
		hmap1.put(1, 'a');
		return true;
	}
	
	public static void main(String[] args) {
		if(isAnagram("aab", "bab")) {
			System.out.println("Is Anagram");			
		} else {
			System.out.println("Is not Anagram");			
		}
		
	}
}

