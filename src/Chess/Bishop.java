package Chess;
import java.util.*;
public class Bishop extends Piece {

	public Bishop(String p, int r){
		super(p, r);
	}

	public void move(String p, int r){
		List<Piece> possmoves = new ArrayList<>();
		
		getTopLeft(possmoves);
		getTopRight(possmoves);
		getBotLeft(possmoves);
		getBotRight(possmoves);
		
		
		if(!has(possmoves, p, r)){
			try{
				throw new Exception("Invalid Square for a bishop");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else {
			Bishop prev = new Bishop(this.phile, this.rank);
			this.phile = p;
			this.rank = r;
			System.out.println("Moved bishop "+prev.toString()+" to "+this.toString());
		}

	}
	
	public void getTopLeft(List<Piece> moves){
		// Phile Dec
		// Rank Inc
		
		int pNum =  PhiletoNum(this.phile);
		int rNum = this.rank;
		while(pNum > 1 && rNum < 8){
			moves.add(new Bishop(NumtoPhile(pNum - 1), rNum + 1));
			pNum -= 1;
			rNum += 1;
		}
	}
	
	
	public void getTopRight(List<Piece> moves){
		// Phile Inc
		// Rank Inc 
		int pNum =  PhiletoNum(this.phile);
		int rNum = this.rank;
		
		while(pNum < 8 && rNum < 8){
			moves.add(new Bishop(NumtoPhile(pNum + 1), rNum + 1));
			pNum += 1;
			rNum += 1;
		}
		
	}
	
	
	public void getBotLeft(List<Piece> moves){
		// Phile Dec
		// Rank Dec
		
		int pNum =  PhiletoNum(this.phile);
		int rNum = this.rank;
		while(pNum > 1 && rNum > 1){
			moves.add(new Bishop(NumtoPhile(pNum - 1), rNum - 1));
			pNum -= 1;
			rNum -= 1;
		}
	}
	
	
	public void getBotRight(List<Piece> moves){
		// Phile Inc
		// Rank Dec 

		int pNum =  PhiletoNum(this.phile);
		int rNum = this.rank;
		while(pNum < 8 && rNum > 1){
			moves.add(new Bishop(NumtoPhile(pNum + 1), rNum - 1));
			pNum += 1;
			rNum -= 1;
		}
	}
}




