package algorithms;

public class LongestUncommonSubsequence_I {
	public int findLUSLength(String a, String b) {
		if(a.equals(b)) {
			return -1;
		} else {
			if(a.length() > b.length()) {
				return a.length();
			} else {
				return b.length();
			}
		}
	}
	
	public static void main(String args[]) {
		LongestUncommonSubsequence_I lus = new LongestUncommonSubsequence_I();
		System.out.println(lus.findLUSLength("aba", "cdc"));
	}
}
