package Checkers;
// import CherkersPiece.*;
public class Board{
	//public CheckersPiece[][] board = new CheckersPiece[8][8];
	public String[][] board = new String[8][8];
	public String red = " r";
	public String black = " b";
	public String captured;
	public void Populate(){	
			for (int i=0; i<8; i++){
				for (int j=0; j<8; j++){
					int x = i;
					int y = j;
					if (i % 2 == 0 && j % 2 == 0){
						board [x][y] = red;
					}else if (i %2 != 0 && j % 2 != 0){
						board [x][y] = red;
					}else{
						board [x][y] = black;
					}
			}
		}
		}
	public void printBoard(){
			
		for (int i=0; i<8; i++){
			for (int j=0; j<8; j++){
				System.out.print(board[i][j]);
			}
		System.out.println("");
		}
	}
	

	

	// public void setPiece(CheckersPiece.color, int x, int y){
		// error if x or y are > 7
		// board[x][y] = p;
	// }
	
	public boolean checkOccupied(int x, int y){
		return (board[x][y] != null);
	}
	
	// public Color checkColor(int x, int y){
		// return board[x][y] color;
	// }
}