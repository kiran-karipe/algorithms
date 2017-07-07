package algorithms;

public class ReverseStringWord {

	public String reverseWords(String s) {
		int start = 0;
		int end = 0;
		char[] ch = s.toCharArray();
		for(int i=0; i <= s.length(); i++) {
			if(s.length() == 0) {
				return null;
			}
			else if(i == s.length() || ch[i] == ' ') {
				end = i-1;
				while(end > (start + end) /2) {
					char temp = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
				//System.out.println(ch);
				start = i + 1;
			}
		}
		s = new String(ch);
		return s;
	}
	
	public static void main(String args[]) {
		ReverseStringWord rsw = new ReverseStringWord();
		System.out.println(rsw.reverseWords("Let's take LeetCode contest"));
	}
}
