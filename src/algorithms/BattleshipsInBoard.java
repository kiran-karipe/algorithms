package algorithms;

public class BattleshipsInBoard {
	
	public int countBattleships(char[][] board) {
		int rowCount = 0;
		int colCount = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j] == 'X' ) {
					colCount++;
				}
			}
			if(colCount > 0) {
				rowCount++;
			}
		}
		System.out.println("Row Count :" + rowCount);
		System.out.println("Column Count :" + colCount);
		return rowCount + colCount;
    }
	
	public static void main(String args[]) {
		BattleshipsInBoard bib = new BattleshipsInBoard();
		char[][] board= {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		System.out.println(bib.countBattleships(board));
		
	}
}
