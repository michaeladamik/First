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
		
		if(!possmoves.contains(new Bishop(p, r))){
			try{
				throw new Exception("Invalid Square for a bishop");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else {
			this.phile = p;
			this.rank = r;
		}

	}
	
	public void getTopLeft(List<Piece> moves){
		// Phile Dec
		// Rank Inc
		
		int pNum =  PhiletoNum(this.phile);
		int rNum = this.rank;
		while(pNum > 0 && rNum < 7){
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
		
		while(pNum < 7 && rNum < 7){
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
		while(pNum > 0 && rNum > 0){
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
		while(pNum < 7 && rNum > 0){
			moves.add(new Bishop(NumtoPhile(pNum + 1), rNum - 1));
			pNum += 1;
			rNum -= 1;
		}
	}
}




