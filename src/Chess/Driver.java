package Chess;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		List<Piece> white = new ArrayList<>();
		white.add(new Rook("h", 0));
		white.get(0).move("f", 2);
	}
}
