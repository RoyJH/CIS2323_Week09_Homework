package Checkers;

public class InvalidMoveException extends Exception {
	public InvalidMoveException(){ 
		super("That move isn't allowed!"); 
	}
}