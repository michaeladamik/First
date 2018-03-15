package Chess;
import processing.core.*;

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
		
	}
	
}
