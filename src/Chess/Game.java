package Chess;
import processing.core.*;
import java.util.*;

public class Game extends PApplet{
	float xm;
	float ym;
	public void setup(){
		size(600, 600);
		xm = width / 10;
		ym = height / 10;
	}
	public void draw(){
		background(255);
		drawBoard();
	}
	void drawBoard(){
		fill(0);
		rect(0, 0, xm, height);
		rect(xm * 9, 0, xm, height);
		rect(0, 0, width, ym);
		rect(0, ym * 9, width, ym);
		strokeWeight(2);
		for(int i = 2; i <= 8; i++){
			line(0, i * ym, width, i * ym);
			line(i * xm, 0, i * xm, height);
		}
	}
	
	
	
	
	
	
	public abstract class Piece {
		int x;
		int y;
		void display(){
			
		}
	}
	public class Pawn extends Piece{
		
		public boolean move(boolean first, boolean capture, int x, int y){
			if(capture){
				if((Math.abs(this.x - x) == 1) && (Math.abs(this.y - y) == 1)) return true;
				else {
					return false;
				}
			}
			if(Math.abs(this.y - y) == 1) return true;
			if(Math.abs(this.y - y) == 2 && first) return true;
			return false;
		}
		
		
		//for every piece other than the pawn, it influences the same squares
		public [RETURN TYPE] influence(){
			return;
		}
	}
	
	public class Rook extends Piece{
		public boolean move(int x, int y){
			if(this.y != y && this.x != x) return false;
			return true;
		}
		
		public [RETURN TYPE] influence(){
			
		}
	}
	
	public class Knight extends Piece{
		public boolean move(int x, int y){
			if(Math.abs(this.x - x) == 1 && Math.abs(this.y - y) == 2) return true;
			if(Math.abs(this.x - x) == 2 && Math.abs(this.y - y) == 1) return true;
			return false;
		}
	}
	
	public class Bishop extends Piece{
		public boolean move(int x, int y){
			if(Math.abs(this.x - x) == Math.abs(this.y - y)) return true;
			return false;
		}
	}
	
	public class Queen extends Piece{
		//NOT FINISHED
		public boolean move(int x, int y){
			// can move in any way but knight
			return true;
		}
	}
	
	public class King extends Piece{
		public boolean move(int x, int y, boolean covered){
			// need to check if the space we are moving to is covered, if it is, we cant move there
			if(Math.abs(this.x - x) == 1 && Math.abs(this.y - y) == 1) return true;
			return false;
		}
	}
	
}





// need to implement function to determine if a piece is blocked
// is this.(x or y) the right way to determine the previous pos to the new pos

