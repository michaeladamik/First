package Chess;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		List<Piece> white = new ArrayList<>();
		white.add(new Pawn("a", 1));
		white.add(new Knight("d", 3));
		white.get(1).move("e", 5);
	}
}
