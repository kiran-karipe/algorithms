package algorithms;

import java.util.HashMap;

public class Parentheses {
	public static HashMap<Character, Character> construct() {
		System.out.println("Building HashMap Parentheses");
		HashMap<Character, Character> parentheses = new HashMap<Character, Character>();

		parentheses.put(')', '(');
		parentheses.put(']', '[');
		parentheses.put('}', '{');
		
		return parentheses;
	}
}
