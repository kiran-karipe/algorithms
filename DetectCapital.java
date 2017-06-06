package algorithms;

public class DetectCapital {

	public boolean detectCapitalUse(String word) {
		char[] ch = word.toCharArray();
		
		if(Character.isLowerCase(ch[0]) && ch.length > 1) {
			for(int i=1; i<ch.length; i++) {
				if(!Character.isLowerCase(ch[i])) {
					return false;
				}
			}
		} else if(Character.isUpperCase(ch[0]) && ch.length > 1) {
			if(Character.isUpperCase(ch[1])) {
				for(int i=1; i<ch.length; i++) {
					if(!Character.isUpperCase(ch[i])) {
						return false;
					}
				}
			} else {
				for(int i=1; i<ch.length; i++) {
					if(!Character.isLowerCase(ch[i])) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		DetectCapital dc = new DetectCapital();
		String word = "Flags";
		System.out.println(dc.detectCapitalUse(word));
	}
}
