package Chess;
import java.util.*;
public class Rook extends Piece{
	public Rook(String p, int r){
		super(p, r);
	}
	
	public void move(String p, int r){
		List<Piece> possmoves = new ArrayList<>();
		getTop(possmoves);
		getRight(possmoves);
		getBot(possmoves);
		getLeft(possmoves);
		
		if(!has(possmoves, p, r)){
			try {
				throw new Exception("Invalid square for the Rook");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else {
			Rook prev = new Rook(this.phile, this.rank);
			this.phile = p;
			this.rank = r;
			System.out.println("Moved rook "+prev.toString()+" to "+this.toString());
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
