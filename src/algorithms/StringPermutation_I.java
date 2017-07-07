package algorithms;

import java.util.Arrays;

public class StringPermutation_I {
	public String sort(String string) {
		char[] ch = string.toCharArray();
		Arrays.sort(ch);
		string = new String(ch);
		return string;
	}
	
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
		String s3 = sort(s1);
		String s4 = sort(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		return s3.equals(s4);
		
	}
	public static void main(String args[]) {
		StringPermutation_I sp = new StringPermutation_I();
		System.out.println(sp.sort("kiran"));
		System.out.println(sp.checkPermutation("tacocat", "coatcct"));
	}
}
