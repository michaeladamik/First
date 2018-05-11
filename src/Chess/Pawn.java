package Chess;

public class Pawn extends Piece{
	public Pawn(String p, int r){
		super(p, r);
	}
	
	public void move(String p, int r){
		if(Math.abs(this.rank - r) > 2){
			try {
				throw new Exception("Can't move a pawn more than 2 spaces");
			} 
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}
		else {
			Pawn prev = new Pawn(this.phile, this.rank);
			this.rank = r;
			System.out.println("Moved pawn "+prev.toString()+" to "+this.toString());
			
		}
		
	}
}
