package algorithms;

public class RepeatedSubstringPattern {
	public boolean repeatedPattern(String s) {
		if(s.length() == 0 || s.length() == 1) {
			return false;
		}
		String s1, s2;
		int i=1, j=1;
		while((i+j) <= s.length()) {
			s1 = s.substring(0, i);
			s2 = s.substring(j, j+i);
			if(s1.equals(s2)) {
				if (i+j == s.length()){
					return true;
				} else {
					j = j + i;			
				}
			} else {
				i++;
				j = i;				
				if(i+j > s.length()) {
					return false;
				}
			}
		}
		
		if (i+j == s.length()) {
			return true;			
		} else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		RepeatedSubstringPattern string = new RepeatedSubstringPattern();
		System.out.println(string.repeatedPattern("aba"));
		System.out.println(string.repeatedPattern("abcabcdabcabcd"));
		System.out.println(string.repeatedPattern("abababab"));
		System.out.println(string.repeatedPattern("ababab"));
		System.out.println(string.repeatedPattern("ababababa"));
	}
}
