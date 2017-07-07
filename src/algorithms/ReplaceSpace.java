package algorithms;

public class ReplaceSpace {
	public char[] replaceAllSpaces(String str, int length) {
		char[] c = str.toCharArray();
		int count = 0;
		for(int i = 0; i < length; i++) {
			if(c[i] == ' ') {
				count = count + 1;
			}
		}
		int index = length + (count * 2);
		if(length < c.length) {
			c[length] = '\0';
		}
		for(int i = length - 1; i >= 0; i--) {
			if(c[i] == ' ') {
				c[index - 1] = '0';
				c[index - 2] = '2';
				c[index - 3] = '%';
				index = index  - 3;
			} else {
				c[index - 1] = c[i];
				index--;
			}
		}
		System.out.println(index);
		return c;
	}
	
	public static void main(String args[]) {
		ReplaceSpace rs = new ReplaceSpace();
		String str = "Mr John Smith    ";
		int length = 13;
		System.out.println(rs.replaceAllSpaces(str, length));
	}
}
