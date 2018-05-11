package Chess;
import java.util.*;
public class Queen extends Piece{

	public Queen(String p, int r){
		super(p, r);
	}
	
	public void move(String p, int r){
		List<Piece> possmoves = new ArrayList<>();
		
		// Bishop 
		getTopLeft(possmoves);
		getTopRight(possmoves);
		getBotLeft(possmoves);
		getBotRight(possmoves);
		
		// Rook
		getTop(possmoves);
		getRight(possmoves);
		getBot(possmoves);
		getLeft(possmoves);
		
		if(!has(possmoves, p, r)){
			try {
				throw new Exception("Invalid square for the Queen. Queen can not go from "+this.toString()+ " to "+new Queen(p, r).toString());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else {
			Queen prev = new Queen(this.phile, this.rank);
			this.phile = p;
			this.rank = r;
			System.out.println("Moved Queen "+prev.toString()+" to "+this.toString());
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



	public void getTop(List<Piece> moves){
		int rNum = this.rank;
		while(rNum < 8){
			moves.add(new Rook(this.phile, rNum + 1));
			rNum++;
		}
	}

	public void getRight(List<Piece> moves){
		int pNum = PhiletoNum(this.phile);
		while(pNum < 8){
			moves.add(new Rook(NumtoPhile(pNum + 1), this.rank));
			pNum++;
		}
	}

	public void getBot(List<Piece> moves){
		int rNum = this.rank;
		while(rNum > 1){
			moves.add(new Rook(this.phile, rNum - 1));
			rNum--;
		}
	}

	public void getLeft(List<Piece> moves){
		int pNum = PhiletoNum(this.phile);
		while(pNum > 1){
			moves.add(new Rook(NumtoPhile(pNum - 1), this.rank));
			pNum--;
		}
	}
}
