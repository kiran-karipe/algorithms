package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	public void setPosition(char[][] ch, int c1, int c2, int number) {
		System.out.println(c1 + " " + c2);
		if(number == 1) {
			ch[c1][c2] = 'x';
			findWinner(ch, c1, c2);
		} else {
			ch[c1][c2] = 'o';
			findWinner(ch, c1, c2);
		}
		System.out.println(Arrays.deepToString(ch));
	}
	public char findWinner(char[][] ch, int c1, int c2) {
		char current_position = ' ';
		for(int i=0; i<ch.length; i++) {
			current_position = ch[i][0];
			int j=1;
			while(j<3) {
				if(current_position != ch[i][j]){
					break;
				}
				j++;
			}
			if((int)current_position != 0 && j == 2) {
				break;
				//System.out.println(current_position);
			}
		}
		//System.out.println(current_position);
		return current_position;
		//System.out.println(current_position);
		/*for(int i=0; i<ch.length; i++) {
			return true;
		}*/
	}
	public static void main(String args[]) {
		TicTacToe ttt = new TicTacToe();
		char[][] ch = new char[3][3];
		int number = 0;
		System.out.println(ch.length);
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<ch.length * ch.length; i++) {
			if(i % 2 == 0) {
				number = 1;
			} else {
				number = 2;
			}
			System.out.println("Enter a your position player" + number);
			String ch1 = scan.next();
			int c1 = Integer.parseInt(Character.toString(ch1.charAt(0)));
			int c2 = Integer.parseInt(Character.toString(ch1.charAt(1)));
			if((int)ch[c1][c2] == 0) {
				ttt.setPosition(ch, c1, c2, number);
			} else {
				System.out.println("Position already occupied");
				i--;
			}
		}
		
	}
}
