package algorithms;

public class LongestCommonPrefix {
	public String findPrefix(String[] str) {
//		char[] ch = new char[str.length];
		String s = "";
		if(str.length == 0) {
			return s;
		}
		int length = str[0].length();
		for(int i=1; i<str.length; i++) {
			if(length > str[i].length()) {
				length = str[i].length();
			} 
		}
		System.out.println(length);
		for(int i=0; i<length; i++) {
			int j;
			for(j=0; j<str.length-1; j++) {
				if(i< str[j+1].length() && str[j].charAt(i) != str[j+1].charAt(i)) {
					return s;
				}
			}
			
				s = s + str[j].charAt(i);
				System.out.println(s);
			
			//System.out.println(ch);
		}
		
		return s;
	}
	
	public static void main(String args[]) {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] str = {"abc","abc","abc","ab"};
		System.out.println(prefix.findPrefix(str));
	}
}
