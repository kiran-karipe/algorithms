package algorithms;

public class IsAnagram {

	public boolean isAnagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			for (int i = 0; i < str1.length(); i++) {
				int j;
				boolean istrue = false;
				for (j = 0; j < str2.length(); j++) {
					if (c1[i] == c2[j]) {
						 istrue = true;
						c2[j]= ' ';
						break;
					} 
				}
				if(!istrue) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		IsAnagram obj = new IsAnagram();
		System.out.println(obj.isAnagram("catt", "ttac"));
	}
}
