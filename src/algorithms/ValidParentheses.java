package algorithms;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {	
	
    public static class Parentheses {
        public static HashMap<Character, Character> construct() {
            HashMap<Character, Character> parentheses = new HashMap<Character, Character>();

            parentheses.put(')', '(');
            parentheses.put(']', '[');
            parentheses.put('}', '{');

            return parentheses;
        }
    }
    
	public static final HashMap<Character, Character> parentheses = new HashMap<Character, Character>(Parentheses.construct());

	public boolean isValid(String s) {
		if(s == null || s.length() == 0) {
			return true;
		}
		if (s.length() % 2 != 0) {
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length();i++) {
			if(!parentheses.containsKey(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else {
				if(stack.isEmpty() || stack.pop() != parentheses.get(s.charAt(i))) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String args[]) {
		ValidParentheses string = new ValidParentheses();
		System.out.println(string.isValid("{([])}"));
		System.out.println(string.isValid("]"));
		System.out.println(string.isValid("{"));
		System.out.println(string.isValid("{}]"));
		System.out.println(string.isValid("{}[]"));
	}	
}
