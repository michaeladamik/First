package Chess;

import java.util.*;

public class Knight extends Piece{
	public Knight(String p, int rank){
		super(p, rank);
	}
	
	public void move(String p, int r){
		List<Piece> possmoves = new ArrayList<>();
		int phileNum = PhiletoNum(this.phile);
		
		String[] philes = new String[4];
		philes[0] = NumtoPhile(phileNum - 1);
		philes[1] = NumtoPhile(phileNum + 1);
		philes[2] = NumtoPhile(phileNum + 2);
		philes[3] = NumtoPhile(phileNum - 2);
		
		possmoves.add(new Knight(philes[0], this.rank + 2));
		possmoves.add(new Knight(philes[1], this.rank + 2));
		possmoves.add(new Knight(philes[2], this.rank + 1));
		possmoves.add(new Knight(philes[2], this.rank - 1));
		possmoves.add(new Knight(philes[1], this.rank - 2));
		possmoves.add(new Knight(philes[0], this.rank - 2));
		possmoves.add(new Knight(philes[3], this.rank - 1));
		possmoves.add(new Knight(philes[3], this.rank + 1));
		
		if(!has(possmoves, p, r)){
			try{
				throw new Exception("Invalid square for knight. Knight can not go from "+this.toString()+ " to "+new Knight(p, r).toString());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else {
			Knight prev = new Knight(this.phile, this.rank);
			this.phile = p;
			this.rank = r;
			System.out.println("Moved knight "+prev.toString()+" to "+this.toString());
		}
	}

}
