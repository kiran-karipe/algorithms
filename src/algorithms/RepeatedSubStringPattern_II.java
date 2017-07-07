package algorithms;

public class RepeatedSubStringPattern_II {
	public boolean repeatedSubString(String s) {
        if(s.length() == 0 || s.length() == 1) {
			return false;
		}
		String s1, s2;
		int i=1;
		while((i+i)<=s.length()) {
			s1 = s.substring(0, i);
			s2 = s.substring(i, i+i);
			if(!s1.equals(s2)) {
				i++;
			} else {
				while((i+i)<s.length()) {
					if(s1.equals(s.substring(i, i+i))) {
						i = i + i;
					} else {
						return false;
					}
				}
				return true;
			}
		}
		return false;
    }
	
	public static void main(String args[]) {
		RepeatedSubStringPattern_II string = new RepeatedSubStringPattern_II();
		System.out.println(string.repeatedSubString("ababcababc"));
	}
}
