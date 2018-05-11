package Chess;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		List<Piece> white = new ArrayList<>();
		List<Piece> black = new ArrayList<>();
		white.add(new Queen("e", 4));
		white.get(0).move("f", 6);
	}
}
