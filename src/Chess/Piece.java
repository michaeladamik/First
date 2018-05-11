package Chess;
import java.util.*;


public abstract class Piece {
	public String phile;
	public int rank;

	public Piece(String p, int r){
		rank = r;
		phile = p;
	}
	
	public abstract void move(String p, int r);

	public String NumtoPhile(int num){
		final Map<Integer, String> NumtoPhile = new HashMap<>();
		NumtoPhile.put(1, "a");
		NumtoPhile.put(2, "b");
		NumtoPhile.put(3, "c");
		NumtoPhile.put(4, "d");
		NumtoPhile.put(5, "e");
		NumtoPhile.put(6, "f");
		NumtoPhile.put(7, "g");
		NumtoPhile.put(8, "h");
		return NumtoPhile.get(num);
	}
	public int PhiletoNum(String p){
		final Map<String, Integer> PhiletoNum = new HashMap<>();
		PhiletoNum.put("a", 1);
		PhiletoNum.put("b", 2);
		PhiletoNum.put("c", 3);
		PhiletoNum.put("d", 4);
		PhiletoNum.put("e", 5);
		PhiletoNum.put("f", 6);
		PhiletoNum.put("g", 7);
		PhiletoNum.put("h", 8);
		return PhiletoNum.get(p);
	}
	
	public boolean has(List<Piece> moves, String p, int r){
		for(Piece a : moves){
			if(a.phile.equals(p) && a.rank == r) return true;
		}
		return false;
	}
	public String toString(){
		return this.phile + (this.rank);
	}
}




