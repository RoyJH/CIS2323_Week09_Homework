package Checkers;

public class CheckersPiece{
	//Object Atrributes
	private static int numberOPieces = 0;
	private String color;
	private int id;
	private int xPos;
	private int yPos;
	private String captured;
	private Boolean capture;
	//private Boolean cap;
	
	//Object Methods
	public void setPosition(int x, int y){
		xPos = x;
		yPos = y;
	}
	public int getx(){
		return xPos;
	}
	public int gety(){
		return yPos;
	}
	// public CheckersPiece(){
		// new CheckersPiece(numberOPieces);
		// numberOPieces.setColor("red");
		// numberOPieces.setPosition(x,y);
		// numberOPieces.setCaptive(false);
		// numberOPieces.kinged(false);
		// numberOPieces++;
	// }
		
	public void setColor(String c){
		color = c;
	}
		
	public String getColor(){
		return color;
		}
	public void setid(int k){
		id = k;
	}
	public int getid(){
		return id;
	}
	public void setCaptive(Boolean cap){
		if (cap==true){
			captured="captured";
		}else{
			captured="free";
		}
	}
	public Boolean getCaptive(){
		return capture;
	}
	public void setCaptured(String p){
		if (capture==true){
			p="True";
		}else{
			p="False";
		}
	}
	public String getCaptured(){
		return captured;
	}
	// public Boolean getCaptive(){
		// return capture;
	// }
	public void printInfo(){
			System.out.println("The piece is " + captured + "\n"
			+ "its color is " + color + "\n"
			+ "and is located at " + xPos + ", " + yPos + "\n"
			+ "It's piece ID is " +  id);
		}
}
