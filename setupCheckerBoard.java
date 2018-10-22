import Checkers.*;

public class setupCheckerBoard{
	public static void main(String[] args){
		
		Board CheckersBoard = new Board();
		CheckersBoard.Populate();
		CheckersBoard.printBoard();
		CheckersPiece p1 = new CheckersPiece();
		p1.setColor("red");
		p1.setCaptive(true);
		p1.setPosition(0,0);
		p1.printInfo();

	}
}