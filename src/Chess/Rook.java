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
		
		if(!possmoves.contains(new Rook(p, r))){
			try {
				throw new Exception("Invalid square for the Rook");
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
	

	public void getTop(List<Piece> moves){
		int rNum = this.rank;
		while(rNum < 7){
			moves.add(new Rook(this.phile, rNum + 1));
			rNum++;
		}
	}

	public void getRight(List<Piece> moves){
		int pNum = PhiletoNum(this.phile);
		while(pNum < 7){
			moves.add(new Rook(NumtoPhile(pNum + 1), this.rank));
			pNum++;
		}
	}

	public void getBot(List<Piece> moves){
		int rNum = this.rank;
		while(rNum > 0){
			moves.add(new Rook(this.phile, rNum - 1));
			rNum--;
		}
	}

	public void getLeft(List<Piece> moves){
		int pNum = PhiletoNum(this.phile);
		while(pNum > 0){
			moves.add(new Rook(NumtoPhile(pNum - 1), this.rank));
			pNum--;
		}
	}
}
