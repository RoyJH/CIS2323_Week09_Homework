import Checkers.*;

public class setupCheckerBoard{
	public static void main(String[] args){
		int pieceId = 0;
		Board CheckersBoard = new Board();
		CheckersBoard.Populate();
		CheckersBoard.printBoard();
		// CheckersPiece p1 = new CheckersPiece();
		// p1.setColor("red");
		// p1.setCaptive(true);
		// p1.setPosition(0,0);
		// p1.printInfo();
		try{
		for(int i = 0; i < 32; i++){
			//String Id = String.valueOf(pieceId);
			CheckersPiece Id = new CheckersPiece();
			Id.setColor("red");
			Id.setCaptive(false);
			Id.setPosition(3,3);
			Id.setid(pieceId);
			Id.printInfo();
			pieceId++;
			if (pieceId % 2 == 0){Id.isValid();}
			else{};
		}		
		for(int i = 32; i >= 32 && i < 64; i++){
			
			//String Id = String.valueOf(pieceId);
			CheckersPiece Id = new CheckersPiece();
			Id.setColor("black");
			Id.setCaptive(false);
			Id.setPosition(8,8);
			Id.setid(pieceId);
			Id.printInfo();
			pieceId++;
		}
		} catch(InvalidMoveException ex){
				System.out.println("That move is invalid");
		}
	}
}