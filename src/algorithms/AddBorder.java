package algorithms;

import java.util.Arrays;
public class AddBorder {
	public String[] addBorder(String[] picture) {
		String[] newPicture = new String[picture.length + 2];
		int maxLength = picture[0].length();
		for(int i=1; i<picture.length; i++) {
			if(picture[i].length() > maxLength) {
				maxLength = picture[i].length();
			}
		}
		for(int i=0; i<maxLength + 2; i++) {
			if(newPicture[0] == null) {
				newPicture[0] = "*";
			} else {
				newPicture[0] = newPicture[0] + "*";
			}
		}
		for(int i=0; i<maxLength + 2; i++) {
			if(newPicture[newPicture.length - 1] == null) {
				newPicture[newPicture.length - 1] = "*";
			} else {
				newPicture[newPicture.length - 1] = newPicture[newPicture.length - 1] + "*";
			}
		}
		for(int i=1; i<=picture.length; i++) {
			newPicture[i] = "*" + picture[i-1] + "*";
		}
		
		return newPicture;
	}
	
	public static void main(String args[]) {
		AddBorder ab = new AddBorder();
		String[] picture = {"abc", "ded"};
		System.out.println(Arrays.toString(ab.addBorder(picture)));
	}
}
