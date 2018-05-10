package Chess;

import java.util.*;

public class Knight extends Piece{
	public Knight(String p, int rank){
		super(p, rank);
	}
	
	public void move(String p, int r){
		List<Piece> possmoves = new ArrayList<>();
		int phileNum = PhiletoNum(this.phile);
		System.out.println(p);
		System.out.println("Should be 3: "+phileNum);
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
		System.out.println("Original spot: "+this.phile+this.rank);
		System.out.println("Others: ");
		for(Piece a : possmoves){
			System.out.println(a.toString());
		}
	}

}
