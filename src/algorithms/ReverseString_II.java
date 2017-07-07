package algorithms;

import java.util.Arrays;

public class ReverseString_II {
	public String reverseString(String s, int k) {
		char[] ch = s.toCharArray();
		int n=0;
		if(k<1) {
			return s;
		}
		while(n<ch.length) {
			int i=n;
			int j = n + (k-1);
			if(ch.length % 2 == 0) {
				while(i<=(n+k-1) && j>=(n+k-1) && j<ch.length) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
					i++;
					j--;
				}
			} else {
				while(i<=(n+k-1) && j>=(n+k-1) && j<ch.length) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
					i++;
					j--;
				}
			}
			n = n+( 2*k);
		}
		s = String.valueOf(ch);
		return s;
	}
	
	public static void main(String args[]) {
		ReverseString_II reverse = new ReverseString_II();
		System.out.println(reverse.reverseString("abcd", 4));
	}
}
