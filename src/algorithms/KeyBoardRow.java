package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;

public class KeyBoardRow {

	public String[] findWords(String[] words) {
		
		ArrayList<Character> a1= new ArrayList(Arrays.asList('q','w','e','r','t','y','u','i','o','p')); 
		ArrayList<Character> a2= new ArrayList(Arrays.asList('a', 's','d','f','g','h','j','k','l')); 
		ArrayList<Character> a3= new ArrayList(Arrays.asList('z', 'x','c','v','b','n','m')); 
		ArrayList<Character> a4= new ArrayList(); 

		ArrayList<String> words1 = new ArrayList<String>();
		for(int i=0; i<words.length; i++) {
			String lowerCase = words[i].toLowerCase();
			if(a1.contains(lowerCase.charAt(0))) {
				a4 = a1;
			} else if(a2.contains(lowerCase.charAt(0))) {
				a4 = a2;
			} else if(a3.contains(lowerCase.charAt(0))) {
				a4 = a3;
			}
			System.out.println(lowerCase);
			
			boolean presentInRow = true;
			for(int j=1; j<words[i].length(); j++) {
				if(!a4.contains(Character.toLowerCase(words[i].charAt(j)))) {
					presentInRow = false;
					System.out.println(words[i].charAt(j));
					break;
				}
			}
			
			if(presentInRow) {
				words1.add(words[i]); 
			}
		}

		String[] result = new String[words1.size()];
		
		return words1.toArray(result);
	}
	
	public static void main(String args[]) {
		KeyBoardRow kr = new KeyBoardRow();
		String[] words = {"Hello","Alaska","Dad","Peace"};
		System.out.println(Arrays.toString(kr.findWords(words)));
	}
}
