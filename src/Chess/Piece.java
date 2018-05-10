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
		NumtoPhile.put(0, "a");
		NumtoPhile.put(1, "b");
		NumtoPhile.put(2, "c");
		NumtoPhile.put(3, "d");
		NumtoPhile.put(4, "e");
		NumtoPhile.put(5, "f");
		NumtoPhile.put(6, "g");
		NumtoPhile.put(7, "h");
		return NumtoPhile.get(num);
	}
	public int PhiletoNum(String p){
		final Map<String, Integer> PhiletoNum = new HashMap<>();
		PhiletoNum.put("a", 0);
		PhiletoNum.put("b", 1);
		PhiletoNum.put("c", 2);
		PhiletoNum.put("d", 3);
		PhiletoNum.put("e", 4);
		PhiletoNum.put("f", 5);
		PhiletoNum.put("g", 6);
		PhiletoNum.put("h", 7);
		return PhiletoNum.get(p);
	}
	
	
	public String toString(){
		return this.phile + (this.rank + 1);
	}
}




