package algorithms;

import java.util.HashSet;

public class DeleteOperationsForTwoStrings {
	public int minDistance(String word1, String word2) {
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();
		for(int i=0; i<word1.length(); i++) {
			set1.add(word1.charAt(i));
		}
		for(int i=0; i<word1.length(); i++) {
			set2.add(word2.charAt(i));
		}
		int count1 = 0;
		for(int i=0; i<word1.length(); i++) {
			if(!set2.contains(word1.charAt(i))) {
				count1 = count1 + 1;
			}
		}
		for(int i=0; i<word1.length(); i++) {
			if(!set1.contains(word2.charAt(i))) {
				count1 = count1 + 1;
			}
		}
		return count1;
	}
	
	public static void main(String args[]) {
		DeleteOperationsForTwoStrings deleteOperations = new DeleteOperationsForTwoStrings();
		System.out.println(deleteOperations.minDistance("sea", "eat"));
	}
}
