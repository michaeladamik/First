package Chess;

public class King extends Piece{
	public King(String p, int r){
		super(p, r);
	}
	
	public void move(String p, int r){
		int thispNum = PhiletoNum(this.phile);
		int pNum = PhiletoNum(p);
		int pDiff = Math.abs(thispNum - pNum);
		int rDiff = Math.abs(this.rank - r);
		if( ( (pDiff == 0) || (pDiff == 1) ) && ( (rDiff == 0) || (rDiff == 1) ) ){
			King prev = new King(this.phile, this.rank);
			this.phile = p;
			this.rank = r;
			System.out.println("Moved King "+prev.toString()+" to "+this.toString());
		}
		else {
			try{
				throw new Exception("Can not move king "+this.toString()+" to "+new King(p, r).toString());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}
