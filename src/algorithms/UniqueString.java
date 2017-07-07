package algorithms;

import java.util.HashMap;

public class UniqueString {
	public int uniqueCharsInString(String string) {		
		if(string == null || string.length() == 0) {
			return -1;
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<string.length(); i++) {
			char current = string.charAt(i); 
			if(map.get(current) != null) {
				map.put(current, map.get(current) + 1);
			} else {
				map.put(current, 1);

			}
		}
		for(int i=0; i<string.length(); i++) {
			if(map.get(string.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		UniqueString string = new UniqueString();
		System.out.println(string.uniqueCharsInString("kkiirran"));
		System.out.println(string.uniqueCharsInString(""));
		System.out.println(string.uniqueCharsInString(null));
		System.out.println(string.uniqueCharsInString("k"));
		System.out.println(string.uniqueCharsInString("kkiirraann"));
		System.out.println(string.uniqueCharsInString("kiran"));
		System.out.println(string.uniqueCharsInString("kkiran"));
		//string.uniqueCharsInString("kkirran");
	}
}
