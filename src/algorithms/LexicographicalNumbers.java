package algorithms;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
	public List<Integer> lexicalOrder(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int current = 1;
		int i = 1;
		while(true){
			list.add(current);
			current = nextNumber(current, n);
			if(++i > n) {
				break; 
			}
		}

		return list;
	}
	
	public int nextNumber(int currentNumber, int lastNumber) {
		if((currentNumber * 10) <= lastNumber) {
			return currentNumber * 10;
		} 
		else if (currentNumber % 10 == 9) {
			while(currentNumber % 10 == 9) {
				currentNumber = currentNumber / 10;
			}
			return (currentNumber + 1);
		}
		else if (currentNumber + 1 <= lastNumber) {
			return currentNumber + 1;
		} 
		else {
			currentNumber = currentNumber / 10;
			while(currentNumber % 10 == 9) {
				currentNumber = currentNumber / 10;
			}
			return currentNumber + 1;
		}
	}
	
	public static void main(String args[]) {
		LexicographicalNumbers numbers = new LexicographicalNumbers();
//		System.out.println(numbers.lexicalOrder(105));
//		System.out.println(numbers.lexicalOrder(10));
//		System.out.println(numbers.lexicalOrder(1));
//		System.out.println(numbers.lexicalOrder(99));
//		System.out.println(numbers.lexicalOrder(9));
//		System.out.println(numbers.lexicalOrder(100));
		System.out.println(numbers.lexicalOrder(23489));
		System.out.println(numbers.lexicalOrder(192));
		System.out.println(numbers.lexicalOrder(34));
	}
}


 